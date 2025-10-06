
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true){
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()){
                break;
            }

            String[] splitSentence = sentence.split(" ");

            for (String s : splitSentence){
                if (s.contains("av")){
                    System.out.println(s);
                }
            }
        }
    }
}
