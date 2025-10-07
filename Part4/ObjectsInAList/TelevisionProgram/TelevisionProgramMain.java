import java.util.ArrayList;
import java.util.Scanner;

public class TelevisionProgramMain {
    public static void main(String[] args) {

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Name: ");
            String programName = scanner.nextLine();

            if (programName.isEmpty()){
                break;
            }

            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(programName, duration));
        }
        System.out.print("Program's maximum duration? ");
        int maximum = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram t : programs){
            if (t.getDuration() <= maximum){
                System.out.println(t);
            }
        }
    }
}
