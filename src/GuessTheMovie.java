import java.io.IOException;

public class GuessTheMovie {
    // tylko głowna metoda

    public static void main(String[] args) throws Exception {
        RandomNumber num = new RandomNumber(); {
            System.out.println(num);}
        Game rf = new Game();
        String filename = "movies.txt";
        try {
            String[] lines = rf.readLines(filename);
            for (String line : lines) {
                System.out.println(lines [1]);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }


        }
    }





