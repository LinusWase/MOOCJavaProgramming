public class SongMain2 {

    public static void main(String[] args) {
        // you can write code here for testing your program

        Song2 song1 = new Song2("Ismo Leikola", "Pendolino", 194);
        Song2 song2 = new Song2("Ismo Leikola", "Pendolino", 194);
        if(song1.equals(song2)) {
            System.out.println("Same!");
        }
    }
}
