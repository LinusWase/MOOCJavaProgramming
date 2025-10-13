public class HeightOrderMain {
    public static void main(String[] args) {
        HeightRoom room = new HeightRoom();
        room.add(new HeightPerson("Lea", 183));
        room.add(new HeightPerson("Kenya", 182));
        room.add(new HeightPerson("Auli", 186));
        room.add(new HeightPerson("Nina", 172));
        room.add(new HeightPerson("Terhi", 185));

        while (!room.isEmpty()) {
            System.out.println(room.take());
        }
    }
}
