package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaleDetailInfoDAO {
    public void addSaleDetailInfo(SaleDetailInfo saleDetail) throws SQLException {
        String sql = "INSERT INTO SaleDetailInfo (detail_id, sale_id, product_id, quantity, total_price) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, saleDetail.getDetailId());
            pstmt.setInt(2, saleDetail.getSaleId());
            pstmt.setInt(3, saleDetail.getProductId());
            pstmt.setInt(4, saleDetail.getQuantity());
            pstmt.setDouble(5, saleDetail.getTotalPrice());
            pstmt.executeUpdate();
        }
    }
}
