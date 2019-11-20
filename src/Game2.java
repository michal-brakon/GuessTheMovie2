import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game2 {

    ArrayList<String> listOfMovies = new ArrayList<>();

    {

        try (Scanner s = new Scanner(new File("movies.txt"))) {
            while (s.hasNext()) {
                listOfMovies.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int size = listOfMovies.size();
        int random = (int) (Math.random() * size + 1);
        System.out.println(listOfMovies.get(random));

        // random number


    }
}

