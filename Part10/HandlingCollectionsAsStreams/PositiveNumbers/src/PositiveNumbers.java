import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(432);
        numbers.add(-1);
        numbers.add(-543);
        numbers.add(23);
        numbers.add(0);

        System.out.println(positive(numbers));

    }

    public static List<Integer> positive(List<Integer> number){
        return number.stream().filter(i -> i >= 0).collect(Collectors.toList());
    }

}
