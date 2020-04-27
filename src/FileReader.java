/**
 * FileReader.java
 * Class that reads a file of profiles and inserts them into a BST
 *
 * @author Joshua MUrray
 * @version 1.0
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    /**
     * Reads file from disk then populates a binary search tree
     *
     * @param filename File to be read
     * @return Tree created from file
     */
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

    /**
     * Creates a tree then sends each line to createProfile method
     *
     * @param in Scanner of whole profile from readProfileSet
     * @return Tree created from file
     */
    private static BST readFile(Scanner in) {
        BST newTree = new BST();
        while (in.hasNextLine()) {
            String nextPerson = in.nextLine();
            Scanner line = new Scanner(nextPerson);
            newTree.insertProfile(createProfile(line));
        }
        return newTree;
    }

    /**
     * Reads a line and creates a profile
     *
     * @param line Scanner for line sent
     * @return profile created from line
     */
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
        Profile nextProfile = new Profile(lastName, firstName, day, mon, year, email, interests, activities);
        System.out.println(nextProfile.toString()); // Prints node being created
        return nextProfile;
    }
}
