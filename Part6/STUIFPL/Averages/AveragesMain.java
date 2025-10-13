import java.util.Scanner;

public class AveragesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();

        UserInterface3 ui = new UserInterface3(register, scanner);
        ui.start();
    }
}
