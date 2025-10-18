
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);

            if (parts[0].equals("add") && amount > 0) {
                firstContainer.add(amount);
            } else if (parts[0].equals("move")) {
                if (firstContainer.contains() >= amount) {
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                }
                else {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(firstContainer.contains());
                }
            } else if (parts[0].equals("remove")) {
                secondContainer.remove(amount);
            }

        }
    }

}
