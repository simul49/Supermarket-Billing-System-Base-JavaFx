package Database;

public class SaleInfo {
    private int saleId;
    private int casherId;
    private int machineId;

    // Getters and setters
    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getCasherId() {
        return casherId;
    }

    public void setCasherId(int casherId) {
        this.casherId = casherId;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }
}
