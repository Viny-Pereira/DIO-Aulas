package linked_list;

public class Node<T> {
    public T content;
    public Node<T> nexNode;

    public Node() {
        this.nexNode = null;
    }

    public Node(T content) {
        this.nexNode = null;
        this.content = content;
    }

    public Node(T content, Node<T> nexNode) {
        this.nexNode = null;
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node<T> getNextNode() {
        return nexNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nexNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{content=" + content + "}";
    }

    public String toStringLinked() {
        String str = "Node{content=" + content + "}";
        if (nexNode != null) {
            str += "->" + nexNode.toString();
        } else {
            str += "->null";
        }
        return str;
    }
}
