import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //comparableInterface();
        //sortingAsLambda();
        sortingMultipleCriteria();
    }

    public static void comparableInterface(){
        List<Member> members = new ArrayList<>();
        members.add(new Member("michael", 177));
        members.add(new Member("matti", 187));
        members.add(new Member("ada", 184));

        members.stream().forEach(s -> System.out.println(s));
        System.out.println();
        members.stream().sorted().forEach(s -> System.out.println(s));
        System.out.println();
        members.stream().forEach(s-> System.out.println(s));
        System.out.println();
        Collections.sort(members);
        members.stream().forEach(s -> System.out.println(s));
    }

    public static void sortingAsLambda(){
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Ada Lovelace", 1815));
        persons.add(new Person("Irma Wyman", 1928));
        persons.add(new Person("Grace Hopper", 1906));
        persons.add(new Person("Mary Coombs", 1929));

        persons.stream().sorted((p1, p2) -> {
            return p1.getBirthYear() - p2.getBirthYear();
        }).forEach(p -> System.out.println(p.getName()));

        System.out.println();

        persons.stream().forEach(p -> System.out.println(p.getName()));

        System.out.println();

        Collections.sort(persons, (p1, p2) -> p1.getBirthYear() - p2.getBirthYear());
        persons.stream().forEach(p -> System.out.println(p.getName()));
    }

    public static void sortingMultipleCriteria(){
        List<Film> films = new ArrayList<>();
        films.add(new Film("A", 2000));
        films.add(new Film("B", 1999));
        films.add(new Film("C", 2001));
        films.add(new Film("D", 2000));

        for (Film e : films){
            System.out.println(e);
        }

        System.out.println();

        Comparator<Film> comparator = Comparator
                .comparing(Film::getReleaseYear)
                .thenComparing(Film::getName);

        Collections.sort(films, comparator);

        for (Film e : films){
            System.out.println(e);
        }
    }
}
