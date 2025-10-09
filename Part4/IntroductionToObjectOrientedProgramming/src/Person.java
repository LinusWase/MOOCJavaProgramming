public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate age, int height, int weight) {
        this.name = name;
        this.birthday = age;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, SimpleDate date){
        this.name = name;
        this.birthday = date;
    }

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public Person(String name){
        this(name, new SimpleDate(1,1,2000), 0, 0);
    }

    public void printPerson() {
        System.out.println("My name is " + this.name + " and I am " + this.birthday + " years old");
    }

    public void growOlder() {
        //this.age++;
    }

    public boolean isOfLegalAge() {
        return false;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double bmi() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }

    public String getName() {
        return this.name;
    }


    @Override
    public String toString() {
        return this.name + ", born on " + this.birthday;
    }
}
