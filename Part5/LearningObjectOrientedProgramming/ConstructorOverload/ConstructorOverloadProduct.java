
public class ConstructorOverloadProduct {

    private String name;
    private String location;
    private int weight;

    public ConstructorOverloadProduct(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    public ConstructorOverloadProduct(String name, String location){
        this(name, location, 1);
    }

    public ConstructorOverloadProduct(String name, int weight){
        this(name, "shelf", weight);
    }

    public ConstructorOverloadProduct(String name){
        this(name, "shelf", 1);
    }


    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}
