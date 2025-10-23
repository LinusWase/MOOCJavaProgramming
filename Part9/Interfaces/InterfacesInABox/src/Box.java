import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> box;
    private double capacity;

    public Box(int capacity){
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }

    public void add(Packable item){
        if (item.weight() + weight() <= this.capacity){
            box.add(item);
        }
    }


    public double weight() {
        double weight = 0;
        for (Packable item : box){
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + this.weight() + " kg";
    }
}
