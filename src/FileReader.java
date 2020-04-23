import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {


    public static BST readProfileSet(String filename) {
        File inputFile = new File(filename);
        try {
            Scanner in = new Scanner(inputFile);
            return readFile(in);

        } catch (FileNotFoundException e) {
            System.out.println("Cannot find " + filename);
            System.exit(0);
        }
        return null;
    }

    private static BST readFile(Scanner in) {
        BST newTree = new BST();
        while (in.hasNextLine()) {
            String nextPerson = in.nextLine();
            Scanner line = new Scanner(nextPerson);
            newTree.insertProfile(createProfile(line));
        }
        return newTree;
    }

    private static Profile createProfile(Scanner line) {
        line.useDelimiter(",");
        String lastName = line.next();
        String firstName = line.next();
        int day = line.nextInt();
        int mon = line.nextInt();
        int year = line.nextInt();
        String email = line.next();
        String[] interests = line.next().split(";");
        String[] activities = line.next().split(";");
        Profile next = new Profile(lastName, firstName, day, mon, year, email, interests, activities);
        System.out.println(next.toString());
        return next;
    }

}
