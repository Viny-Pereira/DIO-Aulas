package doubly_linked_list;

public class DoublyLinkedList<T> {
    private DoubleNode<T> firstNode;
    private DoubleNode<T> lastNode;

    private int lengthList = 0;

    public void add(T element) {
        DoubleNode<T> newNode = new DoubleNode<>(element);
        newNode.setNextNode(null);
        newNode.setPreviousNode(lastNode);

        if (firstNode == null) {
            firstNode = newNode;
        }
        if (lastNode != null) {
            lastNode.setNextNode(newNode);
        }
        lastNode = newNode;
        lengthList++;
    }

    public void add(int index, T element) {
        DoubleNode<T> assistNode = getNode(index);
        DoubleNode<T> newNode = new DoubleNode<>(element);
        newNode.setNextNode(assistNode);

        if (newNode.getNexNode() != null) {
            newNode.setPreviousNode(assistNode.getPreviousNode());
            newNode.getPreviousNode().setPreviousNode(newNode);
        } else {
            newNode.setPreviousNode(lastNode);
            lastNode = newNode;
        }
        if (index == 0) {
            firstNode = newNode;
        } else {
            newNode.getPreviousNode().setNextNode(newNode);
        }
        lengthList++;
    }

    public void remove(int index) {
        if (index == 0) {
            firstNode = firstNode.getNexNode();
            if (firstNode != null) {
                firstNode.setPreviousNode(null);
            }
        } else {
            DoubleNode<T> assistNode = getNode(index);
            assistNode.getPreviousNode().setNextNode(assistNode.getNexNode());
            if (assistNode != lastNode) {
                assistNode.getNexNode().setPreviousNode(assistNode.getPreviousNode());
            } else {
                lastNode = assistNode;
            }
        }
        lengthList--;
    }

    public T get(int index) {
        return getNode(index).getContent();
    }

    private DoubleNode<T> getNode(int index) {
        DoubleNode<T> assistNode = firstNode;
        for (int i = 0; (i < index) && (assistNode != null); i++) {
            assistNode = assistNode.getNexNode();
        }
        return assistNode;
    }

    public int size() {
        return lengthList;
    }

    @Override
    public String toString() {
        String strReturn = "";
        DoubleNode<T> assistNode = firstNode;
        for (int i = 0; i < size(); i++) {
            strReturn += "[Node{content=" + assistNode.getContent() + "}]--->";
            assistNode = assistNode.getNexNode();
        }
        strReturn += "null";
        return strReturn;
    }
}
