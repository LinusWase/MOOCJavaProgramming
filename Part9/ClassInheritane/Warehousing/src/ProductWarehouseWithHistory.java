public class ProductWarehouseWithHistory extends ProductWarehouse{
    private double balance;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.balance = initialBalance;
    }

    //Not working
    public String history(){
        ChangeHistory changeHistory = new ChangeHistory();
        return changeHistory.toString();
    }
}
