import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Game {
    public static String randomLine() throws IOException {
        String result = null;
        Random random = new Random();
        File f = new File("movies.txt");
        int n = 0;
        for (Scanner sc = new Scanner(f);
             sc.hasNext(); ) {
            n++;
            String line = sc.nextLine();
            if (random.nextInt(n) < n) {
                result = line; }
        }
        return result;
    }
    public static String underscoreAll () throws IOException {
        String st = randomLine().replaceAll("[a-zA-Z]", "_");
        return st;
    }


}