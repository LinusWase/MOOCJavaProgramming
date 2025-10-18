import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GradeStatistics {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> passing;

    public GradeStatistics() {
        this.grades = new ArrayList<>();
        this.passing = new ArrayList<>();
    }

    public void Add(int number){
        if (number <= 100 && number >= 0){
            grades.add(number);
            if (number >= 50){
                passing.add(number);
            }
        }
    }

    public double Sum(ArrayList<Integer> list){
        if (!list.isEmpty()) {
            int sum = 0;
            for (Integer i : list) {
                sum += i;
            }
            return 1.0 * sum;
        }
        return -1;
    }

    public double AverageAll(){
        return Sum(this.grades) / grades.size();
    }

    public double AveragePassing(){
        double sum = Sum(this.passing);
        if (sum > 0){
            return sum / this.passing.size();
        }
        return -1;
    }

    public double passPercentage(){
        return 100 * ((double) this.passing.size() / this.grades.size());
    }

    public int gradeDistribution(int grade){

        if ( grade < 50){
            return 0;
        } else if (grade < 60) {
            return 1;
        } else if (grade < 70) {
            return 2;
        } else if (grade < 80) {
            return 3;
        } else if (grade < 90) {
            return 4;
        } else if (grade > 90) {
            return 5;
            }
        return 0;
    }

    public void printStars(){
        System.out.println("Grade distribution:");
        int grade = 5;
        while (grade >= 0) {
            System.out.print(grade + ": ");
            for (Integer i : this.grades) {
                if (gradeDistribution(i) == grade) {
                    System.out.print("*");
                }
            }
            System.out.println();
            grade--;
        }
    }
}
