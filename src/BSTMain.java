public class BSTMain {
    public static void main(String[] args) {
        Profile Josh = new Profile("Murray", "Joshua", 9, 3, 2001
                , "j.murray567@gmail.com", new String[]{"Stuff"}, new String[]{"Swimming"});

        Profile Ben = new Profile("Ben", "Ben", 9, 3, 2001
                , "Ben@gmail.com", new String[]{"Ben"}, new String[]{"Ben"});

        Profile James = new Profile("James", "James", 9, 3, 2001
                , "James@gmail.com", new String[]{"James"}, new String[]{"James"});

        Profile Ryan = new Profile("Ryan", "Ryan", 9, 3, 2001
                , "James@gmail.com", new String[]{"James"}, new String[]{"James"});

        BST tree = new BST();

        tree.insertProfile(Josh);
        tree.insertProfile(Ben);
        tree.insertProfile(James);
        tree.insertProfile(Ryan);
        // Tested via print statements in BST.java, now commented out
    }

}
