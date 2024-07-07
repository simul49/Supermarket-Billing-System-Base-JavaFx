package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductInfoDAO {
    public void addProductInfo(ProductInfo product) throws SQLException {
        String sql = "INSERT INTO ProductInfo (product_id, product_name, price) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, product.getProductId());
            pstmt.setString(2, product.getProductName());
            pstmt.setDouble(3, product.getPrice());
            pstmt.executeUpdate();
        }
    }

}
