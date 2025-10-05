
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true){
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0){
                break;
            } else if (number > 0){
                sum += number;
                counter += 1;
            }
        }
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * sum / counter);
        }
    }
}
