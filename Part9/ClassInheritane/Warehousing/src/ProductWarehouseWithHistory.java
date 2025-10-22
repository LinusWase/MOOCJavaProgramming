public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        history = new ChangeHistory();
        addToWarehouse(initialBalance);
    }

    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        history.add(getBalance());
    }

    public double takeFromWarehouse(double amount){
        double recived = super.takeFromWarehouse(amount);
        history.add(getBalance());
        return recived;
    }

    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history.toString());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }

    public String history() {
        return history.toString();
    }
}
