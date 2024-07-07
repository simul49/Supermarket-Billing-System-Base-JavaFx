


//package Database;
//
//import java.sql.SQLException;
//
//public class Main {
//    public static void main(String[] args) {
//        Casher casher = new Casher();
//        casher.setCasherId)(1;
//        casher.setName("John Doe");
//
//        CashMachineInfo machine = new CashMachineInfo();
//        machine.setMachineId(101);
//        machine.setLocation("Main Store");
//
//        ProductInfo product = new ProductInfo();
//        product.setProductId(1001);
//        product.setProductName("Product A");
//        product.setPrice(9.99);
//
//        SaleInfo sale = new SaleInfo();
//        sale.setSaleId(1);
//        sale.setCasherId(1);
//        sale.setMachineId(101);
//
//        SaleDetailInfo saleDetail = new SaleDetailInfo();
//        saleDetail.setDetailId(1);
//        saleDetail.setSaleId(1);
//        saleDetail.setProductId(1001);
//        saleDetail.setQuantity(2);
//        saleDetail.setTotalPrice(19.98);
//
//        try {
//            CasherDAO casherDAO = new CasherDAO();
//            casherDAO.addCasher(casher);
//
//            CashMachineInfoDAO machineDAO = new CashMachineInfoDAO();
//            machineDAO.addCashMachineInfo(machine);
//
//            ProductInfoDAO productDAO = new ProductInfoDAO();
//            productDAO.addProductInfo(product);
//
//            SaleInfoDAO saleDAO = new SaleInfoDAO();
//            saleDAO.addSaleInfo(sale);
//
//            SaleDetailInfoDAO saleDetailDAO = new SaleDetailInfoDAO();
//            saleDetailDAO.addSaleDetailInfo(saleDetail);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}


package Database;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Casher casher = new Casher();
        casher.setName("Mr Java"); // No need to set casherId

        CashMachineInfo machine = new CashMachineInfo();
        machine.setLocation(" Java Store"); // No need to set machineId

        ProductInfo product = new ProductInfo();
        product.setProductName("Product  Java Fx");
        product.setPrice(9.99); // No need to set productId

        SaleInfo sale = new SaleInfo();
        // saleId will be auto-incremented
        sale.setCasherId(1); // Must exist in Casher table
        sale.setMachineId(101); // Must exist in CashMachineInfo table

        SaleDetailInfo saleDetail = new SaleDetailInfo();
        // detailId will be auto-incremented
        saleDetail.setSaleId(1); // Must exist in SaleInfo table
        saleDetail.setProductId(1001); // Must exist in ProductInfo table
        saleDetail.setQuantity(2);
        saleDetail.setTotalPrice(19.98);

        try {
            CasherDAO casherDAO = new CasherDAO();
            casherDAO.addCasher(casher);

            CashMachineInfoDAO machineDAO = new CashMachineInfoDAO();
            machineDAO.addCashMachineInfo(machine);

            ProductInfoDAO productDAO = new ProductInfoDAO();
            productDAO.addProductInfo(product);

            SaleInfoDAO saleDAO = new SaleInfoDAO();
            saleDAO.addSaleInfo(sale);

            SaleDetailInfoDAO saleDetailDAO = new SaleDetailInfoDAO();
            saleDetailDAO.addSaleDetailInfo(saleDetail);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

