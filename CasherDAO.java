package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CasherDAO {
    public void addCasher(Casher casher) throws SQLException {
        String sql = "INSERT INTO Casher (casher_id, name) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, casher.getCasherId());
            pstmt.setString(2, casher.getName());
            pstmt.executeUpdate();
        }
    }
}
