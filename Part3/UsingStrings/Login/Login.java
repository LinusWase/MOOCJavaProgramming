
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstUser = {"alex", "sunshine"};
        String[] secondUser = {"emma", "haskell"};

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        boolean success = false;

        if (username.equals(firstUser[0]) && password.equals(firstUser[1])){
                success = true;
        }
        else if (username.equals(secondUser[0]) && password.equals(secondUser[1])){
                success = true;
        }

        if (success){
            System.out.println("You have successfully logged in!");
        }
        else {
            System.out.println("Incorrect username or password!");
        }
    }
}
