import java.io.File;

public class FileReaderMain {
    public static void main(String[] args) {
        //FileReader fileReader = new FileReader();
        BST tree = new BST();
        tree = FileReader.readProfileSet("TestProf.txt");

    }
}
