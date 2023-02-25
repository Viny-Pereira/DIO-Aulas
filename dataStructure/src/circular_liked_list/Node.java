package circular_liked_list;

public class Node<T> {
    private T content;
    private Node<T> nextNode;

    public Node(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nexyNode) {
        this.nextNode = nexyNode;
    }

    @Override
    public String toString() {
        return "Node{content=" + content + "}";
    }

}
