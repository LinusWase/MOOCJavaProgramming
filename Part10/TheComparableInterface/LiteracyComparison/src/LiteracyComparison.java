
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<Result> results = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(s -> s.split(","))
                    .map(parts -> new Result(parts[2].replace("(%)", "").trim(), parts[3], Integer.valueOf(parts[4]),
                            Double.valueOf(parts[5])))
                    .forEach(results::add);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        results.stream().sorted((t1, t2) -> Double.compare(t1.getLiteracy(), t2.getLiteracy())).forEach(System.out::println);

    }
}
