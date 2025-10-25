import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = scanner.nextLine();

        Checker checker = new Checker();
        System.out.println(checker.isDayOfWeek(word));

    }
}
