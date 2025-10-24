import java.util.*;

public class Main {
    public static void main(String[] args) {
        ReadingList jonisList = new ReadingList();
        int i = 0;
        while (i < 1000) {
            jonisList.add(new TextMessage("arto", "have you written the tests yet?"));
            i = i + 1;
        }

        System.out.println("Joni's to-read: " + jonisList.toRead());
        System.out.println("Delegating the reading to Verna");

        ReadingList vernasList = new ReadingList();
        vernasList.add(jonisList);
        vernasList.read();

        System.out.println();
        System.out.println("Joni's to-read: " + jonisList.toRead());


        List<String> strings = new ArrayList<>();
        strings.add("string objects inside an arraylist object!");

        List<String> strings1 = new LinkedList<>();
        strings1.add("string object inside a linkedlist object!");

        Map<String, String> maps = new HashMap<>();
        maps.put("ganbatte", "good luck");
        maps.put("hai", "yes");

        for (String key : maps.keySet()){
            System.out.println(key + ": " + maps.get(key));
        }

        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("one");
        set.add("two");

        for (String element : set){
            System.out.println(element);
        }

        Map<String, String> translations = new HashMap<>();
        translations.put("ganbatte", "good luck");
        translations.put("hai", "yes");

        Set<String> keys = translations.keySet();
        Collection<String> keyCollection = keys;

        System.out.println("Keys:");
        for (String key : keyCollection){
            System.out.println(key);
        }

        System.out.println();
        System.out.println("Values: ");
        Collection<String> values = translations.values();

        for (String value : values){
            System.out.println(value);
        }
    }
}
