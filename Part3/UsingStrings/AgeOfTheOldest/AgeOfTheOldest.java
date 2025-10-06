
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }

            String[] splitSentence = sentence.split(",");

            if (oldest < Integer.valueOf(splitSentence[1])){
                oldest = Integer.valueOf(splitSentence[1]);
            }
        }

        System.out.println("Age of the oldest: " + oldest);
    }
}
