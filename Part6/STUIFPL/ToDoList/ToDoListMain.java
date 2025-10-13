import java.util.Scanner;

public class ToDoListMain {
    public static void main(String[] args) {
        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);

        UserInterface2 ui = new UserInterface2(list, scanner);
        ui.start();
    }
}
