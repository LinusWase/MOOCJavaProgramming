import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary translations;

    public TextUI(Scanner scanner, SimpleDictionary translations) {
        this.scanner = scanner;
        this.translations = translations;
    }

    public void addWord(){
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        this.translations.add(word, translation);
    }

    public void getTranslation(){
        System.out.print("To be translated: ");
        String word = scanner.nextLine();
        String translated = this.translations.translate(word);
        if (translated != null) {
            System.out.println("Translation: " + translated);
        } else {
            System.out.println("Word " + word + " was not found");
        }
    }

    public void start(){
        while (true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();
            if (word.equals("end")) {
                break;
            }
            else if(word.equals("add")){
                addWord();
                continue;
            } else if(word.equals("search")){
                getTranslation();
                continue;
            }
            System.out.println("Unknown command");
        }
        System.out.println("Bye bye!");
    }
}
