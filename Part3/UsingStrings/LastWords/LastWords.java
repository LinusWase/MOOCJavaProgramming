
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }
            String[] splitSentence = sentence.split(" ");
            System.out.println(splitSentence[splitSentence.length-1]);
        }
    }
}