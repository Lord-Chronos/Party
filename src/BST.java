import java.util.AbstractCollection;

public class BST {
    private BSTNode root;

    public BST() {

    }

    /**
     * Inserts a profile as a node into the tree
     *
     * @param p Profile to be added to the tree+
     */
    void insertProfile(Profile p) {
        BSTNode newNode = new BSTNode(p);
        if (this.root == null) {
            this.root = newNode;
            //System.out.println("New root: " + p.getFirstName());
        } else {
            recursive(root, newNode);
        }
    }

    /**
     * A recursive method that finds next available node to add profile node to
     *
     * @param current The node that the method is currently at
     * @param newNode The node to be added to the tree
     */
    private void recursive(BSTNode current, BSTNode newNode) {

        String nameC = ((current.getProfile().getFirstName()) + current.getProfile().getLastName());
        String nameN = ((newNode.getProfile().getFirstName()) + newNode.getProfile().getLastName());

        // If nameN smaller go down to the left node
        if (nameN.compareTo(nameC) <= 0) {
            if (current.getL() == null) {
                current.setL(newNode);
                //System.out.println("Left: " + nameN);
            } else {
                //System.out.println("Recursive left: " + nameN);
                recursive(current.getL(), newNode);
            }

            // If nameN bigger go down to the left node
        } else if (nameN.compareTo(nameC) > 0) {
            if (current.getR() == null) {
                current.setR(newNode);
                //System.out.println("Right: " + nameN);
            } else {
                //System.out.println("Recursive right: " + nameN);
                recursive(current.getR(), newNode);
            }
        }
    }

    /**
     * Method calls inOrder method using root node as parameter
     */
    public void printAlphabetic() {
        inOrder(root);
    }

    /**
     * Traverses tree in order and prints out profile of all nodes
     *
     * @param node Current node that method is at
     */
    private void inOrder(BSTNode node) {
        if (node != null) {
            inOrder(node.getL());
            System.out.println(node.getProfile());
            inOrder(node.getR());
        }
    }


}
