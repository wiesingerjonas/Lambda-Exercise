import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    private static String FILENAME = "pupuls.csv";

    public static void main(String[] args) {

        readFile();


    }

    private static void readFile() {
        try {
            System.out.println(Files.readAllLines(Paths.get(FILENAME)).get(0));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
