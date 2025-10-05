
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        int number = Integer.valueOf(scanner.nextLine());
        int counter = 0;
        int sum = 0;

        while(counter < number){
            sum += 1 + counter;
            counter++;
        }
        System.out.println("The sum is " + sum);
    }
}
