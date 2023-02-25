package queue.v2;

public class Queue<T> {
    private Node<T> refNodeEntranceQueue;

    public Queue() {
        this.refNodeEntranceQueue = null;
    }

    public void enqueue(T object) {
        Node<T> newNode = new Node<>(object);
        newNode.setRefNode(refNodeEntranceQueue);
        refNodeEntranceQueue = newNode;
    }

    public T first() {
        if (!this.isEmpty()) {
            Node<T> firstNode = refNodeEntranceQueue;
            while (true) {
                if (firstNode.getRefNode() != null) {
                    firstNode = firstNode.getRefNode();
                } else {
                    break;
                }
            }
            return (T) firstNode.getObject();
        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            Node<T> firstNode = refNodeEntranceQueue;
            Node<T> nodeAuxiliar = refNodeEntranceQueue;
            while (true) {
                if (firstNode.getRefNode() != null) {
                    nodeAuxiliar = firstNode;
                    firstNode = firstNode.getRefNode();
                } else {
                    nodeAuxiliar.setRefNode(null);
                    break;
                }
            }
            return (T) firstNode.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNodeEntranceQueue == null ? true : false;
    }

    @Override
    public String toString() {

        String stringReturn = "";
        Node<T> nodeAuxiliar = refNodeEntranceQueue;
        if (refNodeEntranceQueue != null) {
            while (true) {
                stringReturn += "[Node{object=" + nodeAuxiliar.getObject() + "}]-->";
                if (nodeAuxiliar.getRefNode() != null) {
                    nodeAuxiliar = nodeAuxiliar.getRefNode();
                } else {
                    stringReturn += "null";
                    break;
                }
            }
        } else {
            stringReturn += "null";
        }
        return stringReturn;
    }
}
