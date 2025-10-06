
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()){
                break;
            }
            String[] splitSentende = sentence.split(" ");

            for (String s : splitSentende) {
                System.out.println(s);
            }
        }
    }
}
