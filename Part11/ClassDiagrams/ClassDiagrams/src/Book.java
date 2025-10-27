import java.util.ArrayList;

public class Book {
    private String name;
    private String publisher;
    private ArrayList<Person> authors;

    public ArrayList<Person> getAuthors() {
        return authors;
    }

    public void addAuthor(Person author){
        this.authors.add(author);
    }
}
