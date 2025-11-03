public class Main {
    public static void main(String[] args) throws Exception {
        Storer storer = new Storer();
        storer.writeToFile("diary.txt", "Dear Diary, today was a good day");
    }
}
