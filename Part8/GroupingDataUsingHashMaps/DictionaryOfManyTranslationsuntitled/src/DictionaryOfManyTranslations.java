import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation){
        if (!this.translations.containsKey(word)){
            this.translations.put(word, new ArrayList<>());
        }
        this.translations.get(word).add(translation);
    }

    public ArrayList<String> translate(String word){
        return this.translations.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word){
        this.translations.remove(word);
    }
}
