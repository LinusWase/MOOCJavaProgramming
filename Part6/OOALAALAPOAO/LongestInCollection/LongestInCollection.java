public class LongestInCollection {
    public static void main(String[] args) {
        SimpleCollection2 j = new SimpleCollection2("characters");
        System.out.println("Longest: " + j.longest());

        j.add("magneto");
        j.add("mystique");
        j.add("phoenix");

        System.out.println("Longest: " + j.longest());
    }
}
