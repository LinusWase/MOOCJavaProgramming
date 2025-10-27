import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private ArrayList<Book> book;

    public Person(String initialName){
        this.name = initialName;
        this.age = 0;
    }

    public void printPerson(){
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public String getName() {
        return name;
    }
}
