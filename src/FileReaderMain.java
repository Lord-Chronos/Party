/**
 * FileReaderMain.java
 * Class to test the FileReader.java class
 *
 * @author Joshua Murray
 * @version 1.0
 */
public class FileReaderMain {
    public static void main(String[] args) {
        //FileReader fileReader = new FileReader();
        BST tree = new BST();
        tree = FileReader.readProfileSet("TestProf.txt");

    }
}
