import java.util.Scanner;

public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String name = "";

        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }

            String[] splitSentence = sentence.split(",");

            if (oldest < Integer.valueOf(splitSentence[1])){
                oldest = Integer.valueOf(splitSentence[1]);
                name = splitSentence[0];

            }
        }

        System.out.println("Name of the oldest: " + name);
    }
}

