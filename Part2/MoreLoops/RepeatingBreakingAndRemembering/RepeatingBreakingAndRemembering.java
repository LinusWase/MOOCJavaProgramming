
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int counter = 0;
        int even = 0;
        int odd = 0;

        while (true){
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1){
                break;
            } else if (number % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }


            sum += number;
            counter++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + 1.0*sum/counter);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
