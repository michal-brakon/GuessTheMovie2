import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game2 {

    String password() {
        ArrayList<String> listOfMovies = new ArrayList<>();
        {
            try (Scanner s = new Scanner(new File("movies.txt"))) {
                while (s.hasNext()) {
                    listOfMovies.add(s.nextLine()); // adds new line to array string
                }
            } catch (FileNotFoundException e) { //throws exeption
                e.printStackTrace();
            }
            int size = listOfMovies.size();
            int random = (int) (Math.random() * size); // getting random number from array size

            String underline = listOfMovies.get(random); // change letters to_

            return underline;
        }
    }

    // bierze hasło i pyta urzytkowinka o litere, zamienia litere jeśli jest w haśle

    void userInput() {
        String s = password();
            Scanner user = new Scanner(System.in);
        System.out.println("Your title to guess is: " + s.replaceAll("[a-zA-Z]", "_"));
            System.out.println("Select single letter:");
            String singleChar = user.next();
            if (s.contains(singleChar)) {
              System.out.println("correct");


              //  String correctGuess = singleChar.indexOf(int alphabet);
                System.out.println("Your title to guess is: " + s.replaceAll("[a-zA-Z]", "_"));

            }
            else {
                System.out.println("false");
            }
        }

    }
