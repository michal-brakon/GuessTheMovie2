import java.io.File;
import java.util.Scanner;

public class GuessTheMovie {
    public static void main(String[] args) throws Exception {
        File file = new File("movies.txt");
        Scanner getMovieName = new Scanner (file);
        while (getMovieName.hasNextLine()) {
            String nameOfMovie = getMovieName.next(); } // bierze jedną z lini



        }

    }
