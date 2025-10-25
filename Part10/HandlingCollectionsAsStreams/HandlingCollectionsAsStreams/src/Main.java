import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //readAndPrint();
        //streamMethods();
        //terminalOperations();
        //intermediateOperations();
        objectsAndStream();
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

    public static void intermediateOperations(){
        Person person = new Person("Peter",1989);
        Person person1 = new Person("Ben", 1953);
        Person person2 = new Person("May", 1956);

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person1);
        persons.add(person2);

        // Problem 1: You'll receive a list of persons. Print the number of persons born before the year 1970.
        long count = persons.stream()
                .filter(people -> people.getBirthYear() < 1970)
                .count();
        System.out.println("Count: " + count);

        //Problem 2: You'll receive a list of persons. How many persons' first names start with the letter "A"?
        count = persons.stream()
                .filter(people -> people.getName().startsWith("A"))
                .count();
        System.out.println("Count: " + count);

        //Problem 3: You'll receive a list of persons. Print the number of unique first names in alphabetical order
        persons.stream()
                .map(people -> people.getName())
                .distinct()
                .sorted()
                .forEach(name -> System.out.println(name));

    }

    public static void objectsAndStream(){
        Person person1 = new Person("Ben", 1953);
        Person person2 = new Person("May", 1956);

        Book book1 = new Book(person1, "Spider", 234);
        Book book2 = new Book(person2, "Man", 456);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        double average = books.stream()
                .map(book -> book.getAuthor())
                .mapToInt(author -> author.getBirthYear())
                .average()
                .getAsDouble();

        System.out.println("Average of the authors' birth years: " + average);

    }

}
