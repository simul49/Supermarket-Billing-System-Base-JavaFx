package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaleInfoDAO {
    public void addSaleInfo(SaleInfo sale) throws SQLException {
        String sql = "INSERT INTO SaleInfo (sale_id, casher_id, machine_id) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, sale.getSaleId());
            pstmt.setInt(2, sale.getCasherId());
            pstmt.setInt(3, sale.getMachineId());
            pstmt.executeUpdate();
        }
    }

}
