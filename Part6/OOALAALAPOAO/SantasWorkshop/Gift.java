public class Gift {
    private int giftWeight;
    private String name;

    public Gift(String name, int giftWeight) {
        this.giftWeight = giftWeight;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getWeight(){
        return this.giftWeight;
    }

    public String toString(){
        return this.name + " (" + this.giftWeight + " kg)";
    }
}
