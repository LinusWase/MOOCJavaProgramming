import java.util.Scanner;

public class UserInterface4 {
    private Scanner scanner;
    private JokeManager jokeManager;

    public UserInterface4(JokeManager jokeManager, Scanner scanner) {
        this.scanner = scanner;
        this.jokeManager = jokeManager;
    }

    public void add(){
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.jokeManager.addJoke(joke);
    }

    public void printJokes(){
        System.out.println("Printing the jokes.");
        this.jokeManager.printJokes();
    }

    public void commandHandler(String input){
        if (input.equals("1")){
            add();
        } else if (input.equals("2")) {
            System.out.println(this.jokeManager.drawJoke());
        } else if (input.equals("3")) {
            printJokes();
        }
    }

    public void start(){
        while (true) {
            System.out.println("Commands:\n" +
                    "1 - add a joke\n" +
                    "2 - draw a joke\n" +
                    "3 - list jokes\n" +
                    "X - stop");
            String input = scanner.nextLine();
            if (input.equals("X")) {
                return;
            }
            commandHandler(input);
        }
    }
}
