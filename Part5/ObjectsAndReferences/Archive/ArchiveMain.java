import java.util.ArrayList;
import java.util.Scanner;

public class ArchiveMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();
        ArrayList<String> printList = new ArrayList<>();

        while (true){
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()){
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()){
                break;
            }

            archives.add(new Archive(id, name));
        }

        System.out.println("==Items==");
        for (Archive a : archives){
            if (!printList.contains(a.getIdentifier())){
                printList.add(a.getIdentifier());
                System.out.println(a);
            }
        }
    }
}
