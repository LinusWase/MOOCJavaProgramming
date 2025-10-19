import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start(){
        while (true){
            System.out.print("Command: ");
            String word = scanner.nextLine();
            if (word.equals("stop")){
                break;
            }

            else if (word.equals("add")){
                addToList(scanner);
            } else if (word.equals("list")){
                todoList.print();
            } else if (word.equals("remove")){
                removeFromList(scanner);
            }
        }
    }

    public void addToList(Scanner scanner){
        System.out.print("To add: ");
        String add = scanner.nextLine();
        this.todoList.add(add);
    }

    public void removeFromList(Scanner scanner){
        System.out.print("Which one is removed? ");
        int remove = Integer.valueOf(scanner.nextLine());
        this.todoList.remove(remove);
    }
}
