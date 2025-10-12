public class Archive {
    private String identifier;
    private String name;

    public Archive(String id, String name){
        this.identifier = id;
        this.name = name;
    }

    public String getIdentifier(){
        return this.identifier;
    }

    public String toString(){
        return identifier + ": " + name;
    }
}
