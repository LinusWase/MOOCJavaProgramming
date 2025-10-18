
import java.util.ArrayList;
import java.util.Scanner;

public class SearchingMain {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<BookSearching> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new BookSearching(i, "name " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<BookSearching> books, int searchedId) {
        for (BookSearching book : books){
            if (book.getId() == searchedId){
                return books.indexOf(book);
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<BookSearching> books, long searchedId) {

        int start = 0;
        int end = books.size() - 1;
        int middle = 0;


        while (start <= end) {
            middle = (start + end) / 2;
            BookSearching book = books.get(middle);
            int bookId = book.getId();
            if (bookId == searchedId) {
                return middle;
            } else if (bookId < searchedId) {
                start = middle + 1;
            } else if (bookId > searchedId) {
                end = middle - 1;
            }
        }

        return -1;
    }
}

