public class Main {
    public static void main(String[] args) {
        Hold hold = new Hold(100);
        Suitcase suitcase = new Suitcase(10);
        hold.addSuitcase(suitcase);
        hold.printItems();
    }
}
