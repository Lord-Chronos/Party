public class BSTNodeMain {
    public static void main(String[] args) {
        Profile Josh = new Profile("Murray", "Joshua", 9, 3, 2001
                , "j.murray567@gmail.com", new String[]{"Stuff"}, new String[]{"Swimming"});

        Profile Ben = new Profile("Ben", "Ben", 9, 3, 2001
                , "Ben@gmail.com", new String[]{"Ben"}, new String[]{"Ben"});

        Profile James = new Profile("James", "James", 9, 3, 2001
                , "James@gmail.com", new String[]{"James"}, new String[]{"James"});

        Profile Ryan = new Profile("Ryan", "James", 9, 3, 2001
                , "James@gmail.com", new String[]{"James"}, new String[]{"James"});


        BSTNode nodeJosh = new BSTNode(Josh);
        BSTNode nodeBen = new BSTNode(Ben);
        BSTNode nodeJames = new BSTNode(James);
        BSTNode nodeRyan = new BSTNode(Ryan);

        nodeJosh.setL(nodeBen);
        nodeJosh.setR(nodeJames);
        System.out.println(nodeJosh.getL().getProfile());
        System.out.println(nodeJosh.getR().getProfile());
        System.out.println(nodeJosh.getProfile());
    }

}
