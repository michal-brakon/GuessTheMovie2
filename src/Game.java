import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Game {
    public  void randomLine() throws IOException {
        String result = null;
        Random random = new Random();
        File f = new File("movies.txt");
        Scanner sc = new Scanner(f);
        ArrayList<String> list = new ArrayList<String>();
        while (sc.hasNext()){
            list.add(sc.next());
        }
        sc.close();
        int size = list.size();
        for (int i =0; i < size; i++);

        int ran = (int) (Math.random() * list.size()) +1;

        System.out.println(list.get(ran));

    }

    }


