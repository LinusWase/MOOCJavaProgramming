import java.util.ArrayList;

public class Suitcase {
    private ArrayList<CargoItem> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public int totalWeight (){
        int sum = 0;
        for (CargoItem item : items){
            sum += item.getWeight();
        }
        return sum;
    }

    public void addItem(CargoItem item){
        if (item.getWeight() + totalWeight() > maxWeight){
            return;
        }
        items.add(item);
    }

    public void printItems(){
        for (CargoItem item : items){
            System.out.println(item);
        }
    }

    public CargoItem heaviestItem(){
        if (items.isEmpty()){
            return null;
        }
        CargoItem heavist = items.get(0);

        for (CargoItem item : items){
            if (item.getWeight() > heavist.getWeight()){
                heavist = item;
            }
        }
        return heavist;
    }

    public String toString(){
        if (items.isEmpty()){
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        }
        return this.items.size() + " items (" + totalWeight() + " kg)";
    }
}
