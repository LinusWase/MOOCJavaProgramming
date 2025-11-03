import java.io.PrintWriter;

public class Storer {
    public void writeToFile(String filename, String text) throws Exception{
        PrintWriter writer = new PrintWriter(filename);
        writer.println(text);
        writer.close();
    }
}
