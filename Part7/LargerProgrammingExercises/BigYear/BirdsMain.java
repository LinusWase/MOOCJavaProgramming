import java.util.ArrayList;
import java.util.Scanner;

public class BirdsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        while (true){
            System.out.print("? ");
            String word = scanner.nextLine();

            if (word.equals("Quit")){
                break;
            }
            else if (word.equals("Add")){
                add(scanner, birds);
            } else if (word.equals("Observation")) {
                observation(scanner, birds);
            } else if (word.equals("All")) {
                for (Bird b : birds){
                    System.out.println(b);
                }
            } else if (word.equals("One")) {
                printOne(scanner, birds);
            }
        }
    }

    public static void add(Scanner scanner, ArrayList<Bird> birds){
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();

        birds.add(new Bird(name, latinName));
    }

    public static void observation(Scanner scanner, ArrayList<Bird> birds){
        System.out.print("Bird? ");
        String name = scanner.nextLine();

        for (Bird b : birds){
            if (name.equals(b.getName())) {
                b.addObservation();
                return;
                }
            }
        System.out.println("Not a bird!");
    }

    public static void printOne(Scanner scanner, ArrayList<Bird> birds){
        System.out.print("Bird? ");
        String word = scanner.nextLine();
        if (!birds.isEmpty()){
            for (Bird b : birds){
                if (word.equals(b.getName())){
                    System.out.println(b);
                }
            }
        }
    }
}
