import java.util.Scanner;

public class UserInterface2 {
    private Scanner scanner;
    private TodoList todo;

    public UserInterface2(TodoList todo, Scanner scanner) {
        this.scanner = scanner;
        this.todo = todo;
    }

    public void remove(){
        System.out.print("Which one is removed? ");
        int number = Integer.valueOf(scanner.nextLine());
        todo.remove(number);
    }

    public void add(){
        System.out.print("To add: ");
        String word = scanner.nextLine();
        this.todo.add(word);
    }

    public void handleCommand(String word){
        switch (word) {
            case "add" -> add();
            case "list" -> todo.print();
            case "remove" -> remove();
        }
    }

    public void start(){
        while (true){
            System.out.print("Command: ");
            String word = scanner.nextLine();
            if (word.equals("stop")){
                break;
            }
            handleCommand(word);
        }
    }
}
