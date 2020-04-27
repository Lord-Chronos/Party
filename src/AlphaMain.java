/**
 * AlphaMain.java
 * Class to test the printAlphabetic method in BST.java
 *
 * @author Joshua Murray
 * @version 1.0
 */
public class AlphaMain {
    public static void main(String[] args) {
        Profile A = new Profile("A", "A", 9, 3, 2001
                , "A", new String[]{"A"}, new String[]{"A"});

        Profile B = new Profile("B", "B", 9, 3, 2001
                , "B", new String[]{"B"}, new String[]{"B"});

        Profile C = new Profile("B", "C", 9, 3, 2001
                , "C", new String[]{"C"}, new String[]{"C"});

        Profile D = new Profile("D", "D", 9, 3, 2001
                , "D", new String[]{"D"}, new String[]{"D"});
        Profile E = new Profile("E", "E", 9, 3, 2001
                , "E", new String[]{"E"}, new String[]{"E"});
        Profile F = new Profile("F", "F", 9, 3, 2001
                , "F", new String[]{"F"}, new String[]{"F"});

        BST tree = new BST();

        tree.insertProfile(B);
        tree.insertProfile(F);
        tree.insertProfile(C);
        tree.insertProfile(E);
        tree.insertProfile(D);
        tree.insertProfile(A);

        tree.printAlphabetic();
    }
}