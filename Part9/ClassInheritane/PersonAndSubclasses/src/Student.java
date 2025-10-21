public class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
    }

    public void study(){
        this.credits += 1;
    }

    public int credits(){
        return this.credits;
    }

    public String toString(){
        return super.toString() + "  \n" + "  Student credits " + this.credits;
    }
}
