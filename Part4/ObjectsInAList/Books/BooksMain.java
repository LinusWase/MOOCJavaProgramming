import java.util.ArrayList;
import java.util.Scanner;

public class BooksMain {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()){
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String information = scanner.nextLine();

        for (Book b : books) {
            if (information.equals("everything")) {
                System.out.println(b);
            }
            else if (information.equals("name")){
                System.out.println(b.getBookTitle());
            }
        }
    }
}
