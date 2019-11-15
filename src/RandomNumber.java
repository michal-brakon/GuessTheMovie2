import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class RandomNumber {
    int randomNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("moviex.txt"));
        int lines = 0;
        while (reader.readLine() !=null) { lines++;}
        reader.close();

        int random = (int) (Math.random() * lines) +1;
        return random;

    }
}


