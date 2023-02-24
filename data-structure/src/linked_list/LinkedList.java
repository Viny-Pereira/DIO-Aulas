package linked_list;

public class LinkedList<T> {
    Node<T> referenceEntrancNode;

    public LinkedList() {
        this.referenceEntrancNode = null;
    }

    public void add(T content) {
        Node<T> newNode = new Node<>(content);
        if (this.isEmpty()) {
            referenceEntrancNode = newNode;
            return;
        }
        Node<T> nodeAssist = referenceEntrancNode;
        for (int i = 0; i < size() - 1; i++) {
            nodeAssist = nodeAssist.getNextNode();
        }
        nodeAssist.setNextNode(newNode);
    }

    public T get(int index) {
        return getNode(index).getContent();
    }

    private Node<T> getNode(int index) {
        indexValidation(index);
        Node<T> nodeAssist = referenceEntrancNode;
        Node<T> nodeReturn = null;

        for (int i = 0; i <= index; i++) {
            nodeReturn = nodeAssist;
            nodeAssist = nodeAssist.getNextNode();
        }

        return nodeReturn;
    }

    public T remove(int index) {
        indexValidation(index);
        Node<T> pivotNode = getNode(index);
        if (index == 0) {
            referenceEntrancNode = pivotNode.getNextNode();
            return pivotNode.getContent();
        }

        Node<T> previousNode = getNode(index - 1);
        previousNode.setNextNode(pivotNode.getNextNode());
        return pivotNode.getContent();
    }

    public int size() {
        int lengthList = 0;
        Node<T> referenceAssist = referenceEntrancNode;
        while (true) {
            if (referenceAssist != null) {
                lengthList++;
                if (referenceAssist.getNextNode() != null) {
                    referenceAssist = referenceAssist.getNextNode();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return lengthList;
    }

    private void indexValidation(int index) {
        if (index >= size()) {
            int lastIndex = size() - 1;
            throw new IndexOutOfBoundsException("In this list don't exixt content in index " + index
                    + ".\n The content of this list ended in index" + lastIndex);
        }
    }

    public boolean isEmpty() {
        return referenceEntrancNode == null ? true : false;
    }

    public Node<T> getReferenceEntrancNode() {
        return referenceEntrancNode;
    }

    public void setReferenceEntrancNode(Node<T> referenceEntrancNode) {
        this.referenceEntrancNode = referenceEntrancNode;

    }

    @Override
    public String toString() {
        String strReturn = "";
        Node<T> nodeAssist = referenceEntrancNode;
        for (int i = 0; i < this.size(); i++) {
            strReturn += "Node{content=" + nodeAssist.getContent() + "}--->";
            nodeAssist = nodeAssist.getNextNode();
        }
        strReturn += "null";
        return strReturn;
    }
}
