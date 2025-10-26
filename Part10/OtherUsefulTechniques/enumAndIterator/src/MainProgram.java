import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        Employees t = new Employees();
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Arto", Education.PHD));
        list.add(new Person("Pekka", Education.HS));
        t.add(list);
        t.print(Education.PHD);
    }
}
