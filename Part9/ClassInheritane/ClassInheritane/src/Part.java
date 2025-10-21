public class Part {

    private String identifier;
    private String manufacturer;
    private String desription;

    public Part(String identifier, String desription, String manufacturer) {
        this.identifier = identifier;
        this.desription = desription;
        this.manufacturer = manufacturer;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDesription() {
        return desription;
    }
}
