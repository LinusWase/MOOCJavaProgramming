import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container first = new Container("First");
        Container second = new Container("Second");

        while (true){
            System.out.println(first);
            System.out.println(second);

            String input = scanner.nextLine();
            System.out.println();

            if (input.equals("quit")){
                break;
            }

            String[] parts = input.split(" ");
            if (parts[0].equals("add")){
                first.add(Integer.valueOf(parts[1]));
            } else if (parts[0].equals("move")) {
                second.move(first, Integer.valueOf(parts[1]));
            } else if (parts[0].equals("remove")){
                second.remove(Integer.valueOf(parts[1]));
            }

        }
    }
}
