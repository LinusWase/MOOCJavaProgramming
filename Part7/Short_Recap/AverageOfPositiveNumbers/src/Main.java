import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (true){
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0){
                break;
            }

            if (number > 0){
                sum += number;
                counter++;
            }
        }
        if (counter > 0){
            System.out.println(1.0 * sum / counter);
        }
        else {
            System.out.println("Cannot calculate the average");
        }
    }
}
