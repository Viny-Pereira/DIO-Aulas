package binary_tree;

public class BinaryNode<T extends Comparable<T>> {
    private T content;
    private BinaryNode<T> leftNode;
    private BinaryNode<T> rigthNode;

    public BinaryNode(T content) {
        this.content = content;
        leftNode = rigthNode;
    }

    public BinaryNode() {
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public BinaryNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryNode<T> getRigthNode() {
        return rigthNode;
    }

    public void setRigthNode(BinaryNode<T> rigthNode) {
        this.rigthNode = rigthNode;
    }

    @Override
    public String toString() {
        return "BinaryNode{content=" + content + "}";
    }

}
