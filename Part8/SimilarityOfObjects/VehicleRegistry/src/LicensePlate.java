import java.util.Objects;

public class LicensePlate {
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(Object comparedObject) {
        // if the variables are located in the same place, they're the same
        if (this == comparedObject) {
            return true;
        }

        // if comparedObject is not of type Book, the objects aren't the same
        if (!(comparedObject instanceof LicensePlate)) {
            return false;
        }

        // let's convert the object to a Book-object
        LicensePlate compared = (LicensePlate) comparedObject;

        // if the instance variables of the objects are the same, so are the objects
        if (Objects.equals(this.country, compared.country) &&
                Objects.equals(this.liNumber, compared.liNumber)) {
            return true;
        }

        // otherwise, the objects aren't the same
        return false;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(liNumber);
        result = 31 * result + Objects.hashCode(country);
        return result;
    }
}
