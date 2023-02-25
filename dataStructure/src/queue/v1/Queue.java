package queue.v1;

public class Queue {
    private Node refNodeEntranceQueue;

    public Queue() {
        this.refNodeEntranceQueue = null;
    }

    public void enqueue(Node newNode) {
        newNode.setRefNode(refNodeEntranceQueue);
        refNodeEntranceQueue = newNode;
    }

    public Node first() {
        if (!this.isEmpty()) {
            Node firstNode = refNodeEntranceQueue;
            while (true) {
                if (firstNode.getRefNode() != null) {
                    firstNode = firstNode.getRefNode();
                } else {
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    public Node dequeue() {
        if (!this.isEmpty()) {
            Node firstNode = refNodeEntranceQueue;
            Node nodeAuxiliar = refNodeEntranceQueue;
            while (true) {
                if (firstNode.getRefNode() != null) {
                    nodeAuxiliar = firstNode;
                    firstNode = firstNode.getRefNode();
                } else {
                    nodeAuxiliar.setRefNode(null);
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    public boolean isEmpty() {
        return refNodeEntranceQueue == null ? true : false;
    }

    @Override
    public String toString() {

        String stringReturn = "";
        Node nodeAuxiliar = refNodeEntranceQueue;
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
