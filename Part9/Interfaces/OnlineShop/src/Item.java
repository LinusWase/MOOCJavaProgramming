public class Item {
    private String productName;
    private int productQuantity;
    private int productPrice;

    public Item(String product, int qty, int unitPrice){
        this.productName = product;
        this.productQuantity = qty;
        this.productPrice = unitPrice;
    }

    public int price(){
        return productPrice * productQuantity;
    }

    public void increaseQuantity(){
        this.productQuantity++;
    }

    public String toString(){
        return this.productName + ": " + this.productQuantity;
    }

}
