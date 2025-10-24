import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price){
        if (!this.cart.containsKey(product)) {
            Item item = new Item(product, 1, price);
            this.cart.put(product, item);
            return;
        }
        this.cart.get(product).increaseQuantity();

    }

    public int price(){
        int sum = 0;
        for (Item i : this.cart.values()){
            sum += i.price();
        }
        return sum;
    }

    public void print(){
        for (String s : this.cart.keySet()){
            System.out.println(this.cart.get(s));
        }
    }
}
