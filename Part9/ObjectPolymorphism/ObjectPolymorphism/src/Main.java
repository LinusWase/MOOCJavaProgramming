import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "text";
        Object textString = "another string";

        String text1 = "text";
        Object textString1 = text1;

        Printer printer = new Printer();

        String string = " o ";
        List<String> words = new ArrayList<>();
        words.add("polymorphism");
        words.add("inheritance");
        words.add("encapsulation");
        words.add("abstraction");

        printer.printManyTimes(string, 2);
        printer.printManyTimes(words, 3);

        Serializable serializableString = "string";
        CharSequence charSequenceString = "string";
        Comparable<String> comparableString = "string";

        System.out.println(serializableString);
        System.out.println(charSequenceString);
        System.out.println(comparableString);

        string = "works";
        printer.printCharacters(string);

    }
}
