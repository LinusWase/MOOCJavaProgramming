import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "contains text";
        int wholeNumber = 123;
        double floatingPoint = 3.141592653;
        boolean trueOrFalse = true;

        System.out.println("Text variable: " + text);
        System.out.println("Integer variable: " + wholeNumber);
        System.out.println("Floating-point variable: " + floatingPoint);
        System.out.println("Boolean: " + trueOrFalse);

        int value = 10;
        System.out.println(value);
        value = 4;
        System.out.println(value);

        System.out.println("Write a value: ");
        int newValue = Integer.valueOf(scanner.nextLine());
        System.out.println("You wrote " + newValue);
    }
}