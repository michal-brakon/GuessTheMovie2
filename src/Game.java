import java.io.File;
import java.util.Scanner;


public class Game {

    // obiekt to bedzie gra
    // boolean rezultatGry; true - zwyciestwo, false przegrana


     void givingTitle() throws Exception { // nowa metoda, która zwraca pojedynczy String z pliku

        int titleNumber;
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);{
            int i = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                i++;
                int random = (int) (Math.random() * i + 1);
                String title = line.valueOf(random);

                System.out.println("jajko");



                // to jest nie potrzebne

                //tu pwostanie druga czesc metody, ktora zamieni tytył na ______
            }

            }
     }

}



