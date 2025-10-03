import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a message: ");
        String message = scanner.nextLine();

        System.out.println(message);

        String new_message = "Hello World";
        System.out.println(new_message);
        System.out.println("Hello " + "world!");
        System.out.println(new_message + " ...and myself");
        }
    }