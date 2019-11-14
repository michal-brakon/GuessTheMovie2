import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class GuessTheMovie {
    public static void main(String[] args) throws Exception {
        File file = new File("movies.txt");
        int c = 0;
        Scanner getMovieName = new Scanner (file);
        while (getMovieName.hasNextLine()) {
            String nameOfMovie = getMovieName.nextLine();
            c++;
            Random random = new Random();
            int r = random.nextInt(c);
            System.out.println(r);
            }



        }

    }
