import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String user_string = scan.nextLine();
        System.out.println("Give an integer:");
        int user_int = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double user_double = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean user_boolean = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + user_string);
        System.out.println("You gave the integer " + user_int);
        System.out.println("You gave the double " + user_double);
        System.out.println("You gave the boolean " + user_boolean);

    }
}
