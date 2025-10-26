import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //stringBuilder();
        //regularExpression(scanner);
        //alternation();
        //enums();
    }

    public static void stringBuilder(){
        StringBuilder numbers = new StringBuilder();
        for (int i = 1; i < 5; i++){
            numbers.append(i);
        }
        System.out.println(numbers.toString());
    }

    public static void regularExpression(Scanner scanner){
        System.out.print("Provide a student number: ");
        String number = scanner.nextLine();

        if (number.matches("01[0-9]{7}")){
            System.out.println("Correct format.");
        } else {
            System.out.println("Incorrect format.");
        }
    }

    public static void alternation(){
        String string = "00";

        if (string.matches("00|111|0000")) {
            System.out.println("The string contained one of the three alternatives");
        } else {
            System.out.println("The string contained none of the alternatives");
        }
    }

    public static void enums(){
        Card first = new Card(10, Suit.HEARTS);

        System.out.println(first);

        if (first.getSuit() == Suit.SPADE){
            System.out.println("is a spade");
        } else {
            System.out.println("is not a spade");
        }

        System.out.println(Suit.DIAMOND.ordinal());
        System.out.println(Suit.HEARTS.ordinal());

        System.out.println(Color.GREEN.getCode());
    }
}
