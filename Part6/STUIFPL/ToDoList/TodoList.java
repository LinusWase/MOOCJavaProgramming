import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private ArrayList<String> todolist;
    //private Scanner scanner;

    public TodoList() {
        this.todolist = new ArrayList<>();
    }

    public void add(String task){
        this.todolist.add(task);
    }

    public void print(){
        int counter = 1;
        for (String item : todolist){
            System.out.println(counter + ": " + item);
            counter++;
        }
    }

    public void remove(int number){
        this.todolist.remove(number - 1);
    }
}
