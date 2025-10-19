import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> storeAbbreviations;

    public Abbreviations(){
        this.storeAbbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        this.storeAbbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        return this.storeAbbreviations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){
        if (this.hasAbbreviation(abbreviation)){
            return this.storeAbbreviations.get(abbreviation);
        }
        return null;
    }
}
