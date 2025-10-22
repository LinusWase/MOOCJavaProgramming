import java.util.HashMap;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private HashMap<String, Integer> myBox;

    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.myBox = new HashMap<>();
    }

    @Override
    public void add(Item item) {
        if (this.capacity - item.getWeight() >= 0){
            myBox.put(item.getName(), item.getWeight());
            this.capacity -= item.getWeight();
        }

    }

    @Override
    public boolean isInBox(Item item) {
        return this.myBox.containsKey(item.getName());
    }
}
