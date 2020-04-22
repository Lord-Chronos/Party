public class BSTNode {
    private Profile data;
    private BSTNode l;
    private BSTNode r;

    public BSTNode(Profile data){
        this.data = data;
    }

    public Profile getProfile() {
        return data;
    }

    public BSTNode getL() {
        return l;
    }

    public BSTNode getR() {
        return r;
    }

    public void setL(BSTNode l) {
        this.l = l;
    }

    public void setR(BSTNode r) {
        this.r = r;
    }
}
