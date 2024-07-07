package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CashMachineInfoDAO {
    public void addCashMachineInfo(CashMachineInfo machine) throws SQLException {
        String sql = "INSERT INTO CashMachineInfo (machine_id, location) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, machine.getMachineId());
            pstmt.setString(2, machine.getLocation());
            pstmt.executeUpdate();
        }
    }

}
