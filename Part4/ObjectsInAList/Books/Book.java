public class Book {
    private String bookTitle;
    private int bookLength;
    private int publishYear;

    public Book(String title, int length, int year){
        this.bookLength = length;
        this.bookTitle = title;
        this.publishYear = year;
    }

    public String toString(){
        return this.bookTitle + ", " + this.bookLength + " pages, " + this.publishYear;
    }

    public String getBookTitle(){
        return this.bookTitle;
    }
}
