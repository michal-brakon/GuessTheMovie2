import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RandomNumber {
    int randomNumber() throws IOException {
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        int i = 0;
        while (scanner.hasNextLine()) {
            i = scanner.nextInt();
            i++;}
            int random = (int) (Math.random() * 1) +1;
            return random;
    }

    }
