import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("movies.txt");
            Scanner scanner = new Scanner(file);
            ArrayList<String> movieList = new ArrayList<>();

            int counter = 0;

            while(scanner.hasNext()) {
                movieList.add(scanner.nextLine();)
            }
            System.out.printf("I have %d movies, first one is %s", counter, movie);
        } catch {
            System.out.println("");
        }

    }
}
