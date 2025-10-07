
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();

        System.out.println("Team:");
        String teamName = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner reader = new Scanner(Paths.get(fileName))){
            while (reader.hasNextLine()){
                String line  = reader.nextLine();
                String[] parts = line.split(",");
                int home = Integer.valueOf(parts[2]);
                int away = Integer.valueOf(parts[3]);

                if (line.contains(teamName)){
                    games++;
                    if (parts[0].equals(teamName)){
                        if (home > away){
                            wins++;
                        }
                        else {
                            losses++;
                        }
                    }
                    else {
                        away = Integer.valueOf(parts[2]);
                        home = Integer.valueOf(parts[3]);
                        if (home > away){
                            wins++;
                        }
                        else {
                            losses++;
                        }
                    }

                }

            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
