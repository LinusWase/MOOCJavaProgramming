import java.util.ArrayList;

public class ObjectsInAList {
    public static void main(String[] args) {
        ArrayList<Person2> persons = new ArrayList<>();

        Person2 john = new Person2("John");
        persons.add(john);

        persons.add(new Person2("Matthew"));
        persons.add(new Person2("Martin"));

        for (Person2 person2: persons){
            System.out.println(person2);
        }

    }
}
