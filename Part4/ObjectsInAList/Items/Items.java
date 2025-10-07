
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a name, empty will stop: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            items.add(new Item(name));
        }

        System.out.println("Persons in total: " + items.size());
        System.out.println("Persons:");
        for (Item i : items){
            System.out.println(i);
        }

    }
}
