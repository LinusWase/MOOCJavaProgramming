import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longest = 0;
        String name = "";
        int sum = 0;
        int counter = 0;

        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }

            String[] splitSentence = sentence.split(",");

            if (longest < splitSentence[0].length()){
                longest = splitSentence[0].length();
                name = splitSentence[0];
            }
            sum += Integer.valueOf(splitSentence[1]);
            counter++;
        }

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (double)sum/counter);

    }
}
