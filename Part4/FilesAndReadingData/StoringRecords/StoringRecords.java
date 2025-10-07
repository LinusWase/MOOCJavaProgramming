
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<StoringRecordsPerson> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (StoringRecordsPerson person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<StoringRecordsPerson> readRecordsFromFile(String file) {
        ArrayList<StoringRecordsPerson> persons = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                persons.add(new StoringRecordsPerson(name, age));
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return persons;

    }
}
