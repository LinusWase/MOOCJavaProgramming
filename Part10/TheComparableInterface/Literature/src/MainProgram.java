
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true){
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if (bookName.isEmpty()){
                break;
            }

            System.out.print("Input the age recommendation: ");
            int ageRecommend = Integer.valueOf(scanner.nextLine());

            books.add(new Book(bookName, ageRecommend));
            System.out.println();
        }

        System.out.println();
        System.out.println(books.size() + " books in total. \n");

        System.out.println("Books:");

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRec)
                .thenComparing(Book::getName);

        Collections.sort(books, comparator);

        books.forEach(book -> System.out.println(book));

    }

}
