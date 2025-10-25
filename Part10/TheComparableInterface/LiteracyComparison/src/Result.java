public class Result {
    private String sex;
    private String country;
    private int year;
    private double literacy;

    public Result(String sex, String country, int year, double literacy) {
        this.sex = sex;
        this.country = country;
        this.year = year;
        this.literacy = literacy;
    }

    public double getLiteracy() {
        return literacy;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.sex + ", " + this.literacy;
    }
}
