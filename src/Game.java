import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Game {
    public Game(File file) {
    }

    public static String randomLIne(File f) throws IOException {
        String result = null;
        Random random = new Random();
        int n = 0;
        for (Scanner sc = new Scanner(f); sc.hasNext(); ) {
            n++;
            String line = sc.nextLine();
            if (random.nextInt(n) < n) {
                result = line; }

        }
        return result;

    }
}