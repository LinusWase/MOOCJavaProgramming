
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        int maximumValue = 100;
        int helper = 0;


        while (true) {
            System.out.println("First: " + firstContainer + "/" + maximumValue);
            System.out.println("Second: " + secondContainer + "/" + maximumValue);

            System.out.print("> ");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);
            if (parts[0].equals("add") && amount > 0) {
                firstContainer += amount;
            } else if (parts[0].equals("move")) {
                if (firstContainer >= amount) {
                    firstContainer -= amount;
                    secondContainer += amount;
                }
                else {
                    helper = firstContainer;
                    secondContainer = helper;
                    firstContainer = 0;
                    helper = 0;
                }
            } else if (parts[0].equals("remove")) {
                secondContainer -= amount;
            }


            if (firstContainer > 100){
                firstContainer = 100;
            } else if (firstContainer < 0) {
                firstContainer = 0;
            }
            if (secondContainer > 100){
                secondContainer = 100;
            } else if (secondContainer < 0) {
                secondContainer = 0;
            }

        }
    }

}
