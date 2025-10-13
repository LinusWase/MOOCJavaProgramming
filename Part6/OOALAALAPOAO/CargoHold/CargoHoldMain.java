public class CargoHoldMain {
    public static void main(String[] args) {
        CargoItem book = new CargoItem("The lord of the rings", 2);
        CargoItem phone = new CargoItem("Nokia 3210", 1);
        CargoItem brick = new CargoItem("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }
}
