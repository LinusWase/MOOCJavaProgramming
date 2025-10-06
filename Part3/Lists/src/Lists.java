import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {

        ArrayList<Integer> ilist = new ArrayList<>();
        ilist.add(1);

        ArrayList<Double> dlist = new ArrayList<>();
        dlist.add(4.2);

        ArrayList<Boolean> blist = new ArrayList<>();
        blist.add(true);

        ArrayList<String> slist = new ArrayList<>();
        slist.add("String is a reference-type variable");

        ArrayList<Integer> list = new ArrayList<>();

        list.add(15);
        list.add(18);
        list.add(21);
        list.add(24);

        list.remove(2);
        list.remove(Integer.valueOf(18));

        System.out.println("Index 0 so the first value: " + list.get(0));
        System.out.println("Index 1 so the second value: " + list.get(1));


        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        print(strings);

        int[] numbers = {100, 1, 42};

        String[] arrayOfStrings = {"Matti L.", "Matti P.", "Matti V."};
        double[] arrayOfFloatingpoints = {1.20, 3.14, 100.0, 0.6666666667};

        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.println(arrayOfStrings[i] + " " +  arrayOfFloatingpoints[i]);
        }
    }

    public static void print(ArrayList<String> list) {
        for (String value: list) {
            System.out.println(value);
        }
    }
}
