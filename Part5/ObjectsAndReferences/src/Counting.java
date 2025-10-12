public class Counting {
    private int value;

    public Counting(){
        this(0);
    }

    public Counting(int initialValue){
        this.value = initialValue;
    }

    public void increase(){
        this.value += 1;
    }

    public String toString(){
        return "value: " + value;
    }

    public Counting clone(){
        Counting clone = new Counting(this.value);

        return clone;
    }
}
