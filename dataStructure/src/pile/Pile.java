package pile;

public class Pile {

    private Node refNodePileEnter;

    public Pile() {
        this.refNodePileEnter = null;
    }

    public Node top() {
        return refNodePileEnter;
    }

    public void push(Node newNode) {
        Node refAuxiliar = refNodePileEnter;
        refNodePileEnter = newNode;
        refNodePileEnter.setRefNode(refAuxiliar);
    }

    public Node pop() {
        if (!this.isEmpty()) {
            Node NodePoped = refNodePileEnter;
            refNodePileEnter = refNodePileEnter.getRefNode();
            return NodePoped;
        }
        return null;
    }

    public boolean isEmpty() {
        if (refNodePileEnter == null)
            return true;
        return false;
    }

    @Override
    public String toString() {

        String stringReturn = "----------------\n";
        stringReturn += "      Pile\n";
        stringReturn += "----------------\n";

        Node nodeAuxiliar = refNodePileEnter;

        while (true) {
            if (nodeAuxiliar != null) {
                stringReturn += "[Node{data=" + nodeAuxiliar.getData() + "}]\n";
                nodeAuxiliar = nodeAuxiliar.getRefNode();
            } else {
                break;
            }
        }
        stringReturn += "================\n";
        return stringReturn;
    }
}