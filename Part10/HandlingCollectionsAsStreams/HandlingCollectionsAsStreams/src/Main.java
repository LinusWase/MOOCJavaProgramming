import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //readAndPrint();
        //streamMethods();
        terminalOperations();
    }

    public static void readAndPrint(){
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        //reading inputs
        while (true){
            String row = scanner.nextLine();
            if (row.equals("end")){
                break;
            }

            inputs.add(row);
        }

        // Counting numbers divisible by three
        long numbersDivisibleByThree =
                inputs.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(number -> number % 3 == 0)
                        .count();

        //working out the average
        double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.println("Divisible by three " + numbersDivisibleByThree);
        System.out.println("Average number: " + average);
    }

    public static void streamMethods(){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(6);

        ArrayList<Integer> values = list.stream()
                .filter(value -> value > 5)
                .map(value -> value*2)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(values);
    }

    public static void terminalOperations(){
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(-17);
        values.add(-6);
        values.add(8);

        //System.out.println("Values: " + values.stream().count());
        /*values.stream()
                .filter(value -> value % 2 == 0)
                .forEach(value -> System.out.println(value));*/
        ArrayList<Integer> positives = values.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        positives.stream()
                .forEach(value -> System.out.println(value));

        int sum = values.stream()
                .reduce(0, (previousSum, value) -> previousSum + value);
        System.out.println(sum);
    }

}
