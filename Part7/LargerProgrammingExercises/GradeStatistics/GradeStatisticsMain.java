import java.util.ArrayList;
import java.util.Scanner;

public class GradeStatisticsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeStatistics grades = new GradeStatistics();

        System.out.println("Enter point totals, -1 stops:");
        while (true){
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1){
                break;
            }
            grades.Add(number);
        }

        System.out.println("Point average (all): " + grades.AverageAll());

        //Average passing
        System.out.print("Point average (passing): ");
        if (grades.AveragePassing() != -1){
            System.out.println(grades.AveragePassing());
        }
        else {
            System.out.println("-");
        }

        System.out.println("Pass percentage: " + grades.passPercentage());

        grades.printStars();

    }
}
