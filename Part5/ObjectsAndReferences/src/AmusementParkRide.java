public class AmusementParkRide {
    private String name;
    private int lowestHeight;
    private int visitors;

    public AmusementParkRide(String name, int lowestHeight){
        this.name = name;
        this.lowestHeight = lowestHeight;
    }

    public boolean allowedToRide(Person person){
        if (person.getHeight() < this.lowestHeight) {
            return false;
        }
        this.visitors++;
        return true;
    }

    public String toString(){
        return this.name + ", minimum height: " + this.lowestHeight + ", visitors: " + this.visitors;
    }
}
