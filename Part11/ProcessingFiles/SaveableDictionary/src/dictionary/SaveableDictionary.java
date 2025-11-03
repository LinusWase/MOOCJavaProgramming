package dictionary;


import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file){
        this.file = file;
        this.dictionary = new HashMap<>();
    }

    public boolean load(){
        try{
            Scanner fileReader = new Scanner(Paths.get(this.file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public void add(String words, String translation){
        this.dictionary.putIfAbsent(words, translation);
        this.dictionary.putIfAbsent(translation, words);
    }

    public String translate(String word){
        return this.dictionary.get(word);
    }

    public void delete(String word){
        String translation = this.dictionary.get(word);
        this.dictionary.remove(word);
        this.dictionary.remove(translation);
    }

    public boolean save(){
        try {
            FileWriter storer = new FileWriter(this.file);
            StringBuilder content = new StringBuilder();
            for (String key : this.dictionary.keySet()) {
                String value = this.dictionary.get(key);
                if (key.compareTo(value) < 0) {
                    content.append(key).append(":").append(value).append("\n");
                }
            }
            storer.write(content.toString());
            storer.close();
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
