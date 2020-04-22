public class BST {
    private BSTNode root;

    public BST() {

    }

    void insertProfile(Profile p) {
        BSTNode newNode = new BSTNode(p);
        if (this.root == null) {
            this.root = newNode;
            System.out.println("New root: " + p.getFirstName());
        } else {
            recursive(root, newNode);
        }
    }

    private void recursive(BSTNode current, BSTNode newNode) {
        String nameC = ((current.getProfile().getFirstName()) + current.getProfile().getLastName());
        String nameN = ((newNode.getProfile().getFirstName()) + newNode.getProfile().getLastName());
        System.out.println((nameC.compareTo(nameN)));

        if (nameN.compareTo(nameC) <= 0) {
            if (current.getL() == null) {
                current.setL(newNode);
                System.out.println("Left: " + nameN);
            } else {
                System.out.println("Recursive left: " + nameN);
                recursive(current.getL(), newNode);
            }

        } else if (nameN.compareTo(nameC) > 0) {
            if (current.getR() == null) {
                current.setR(newNode);
                System.out.println("Right: " + nameN);
            } else {
                System.out.println("Recursive right: " + nameN);
                recursive(current.getR(), newNode);
            }
        }
    }
}
