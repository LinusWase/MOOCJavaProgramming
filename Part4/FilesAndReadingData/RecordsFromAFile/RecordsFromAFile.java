
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.next();

        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                if (line.isEmpty()){
                    continue;
                }

                String[] parts = line.split(",");
                System.out.println(parts[0] + ", age: " + parts[1] + " years");
            }

        } catch (Exception e) {
            System.out.println("There was a problem reading file: " + e.getMessage());
        }
    }
}
