
public class Part5Books {

    private String name;
    private int publicationYear;

    public Part5Books(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }

        if (!(compared instanceof Part5Books)){
            return false;
        }

        Part5Books comparedBook = (Part5Books) compared;

        return this.name.equals(comparedBook.name) && this.publicationYear == comparedBook.publicationYear;
    }
}
