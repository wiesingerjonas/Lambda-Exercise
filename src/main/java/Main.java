import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    private static String FILENAME = "pupuls.csv";

    public static void main(String[] args) {

        List<Pupil> pupils = readFile();

    }

    private static List<Pupil> readFile() {

        List<Pupil> pupils = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(FILENAME));

            for (int i = 1; i < lines.size(); i++) {
                String[] lineParts = lines.get(i).split(";");
                pupils.add(new Pupil(Integer.parseInt(lineParts[0]),
                                    lineParts[1],
                                    lineParts[2],
                                    lineParts[3],
                                    Integer.parseInt(lineParts[4]), lineParts[5]));

            }

            return pupils;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
