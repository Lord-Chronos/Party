public class BSTNode {
    private Profile data;
    private BSTNode l;
    private BSTNode r;

    public BSTNode(Profile data) {
        this.data = data;
    }

    /**
     * Gets the profile of the current node
     *
     * @return Profile associated to node
     */
    public Profile getProfile() {
        return data;
    }

    /**
     * Gets the node to the left of this node
     *
     * @return Node associated to the lef of node
     */
    public BSTNode getL() {
        return l;
    }

    /**
     * Gets the node to the right of this node
     *
     * @return Node associated to the right of node
     */
    public BSTNode getR() {
        return r;
    }

    /**
     * Sets the node to the left of this node
     *
     * @param l Node associated to left of node
     */
    public void setL(BSTNode l) {
        this.l = l;
    }

    /**
     * Sets the node to the right of this node
     *
     * @param r Node associated to right of node
     */
    public void setR(BSTNode r) {
        this.r = r;
    }
}
