package circular_liked_list;

public class CircularLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int lengthList;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.lengthList = 0;
    }

    public void add(T content) {
        Node<T> newNode = new Node<>(content);
        if (lengthList == 0) {
            this.head = newNode;
            this.tail = this.head;
            this.head.setNextNode(this.tail);
        } else {
            newNode.setNextNode(this.tail);
            this.head.setNextNode(newNode);
            this.tail = newNode;
        }
        this.lengthList++;
    }

    public void remove(int index) {
        if (index >= this.lengthList)
            throw new IndexOutOfBoundsException(index + "is out of range of this list");
        Node<T> assistNode = tail;
        if (index == 0) {
            this.tail = this.tail.getNextNode();
            this.head.setNextNode(assistNode);
        } else if (index == 1) {
            this.head.setNextNode(this.head.getNextNode().getNextNode());
        } else {
            for (int i = 0; i < index - 1; i++) {
                assistNode = assistNode.getNextNode();
            }
            assistNode.setNextNode(assistNode.getNextNode().getNextNode());
        }
        this.lengthList--;
    }

    public T get(int index) {
        return getNode(index).getContent();
    }

    public Node<T> getNode(int index) {
        if (isEmpty())
            throw new IndexOutOfBoundsException("This list is empty!");
        if (index == 0) {
            return this.tail;
        }

        Node<T> assistNode = this.tail;
        for (int i = 0; (i < index) && (assistNode != null); i++) {
            assistNode = assistNode.getNextNode();
        }
        return assistNode;
    }

    public boolean isEmpty() {
        return this.lengthList == 0 ? true : false;
    }

    public int size() {
        return this.lengthList;
    }

    @Override
    public String toString() {
        String strReturn = "";
        Node<T> assisNode = this.head;
        for (int i = 0; i < size(); i++) {
            strReturn += "[No{content=" + assisNode.getContent() + "}]--->";
            assisNode = assisNode.getNextNode();
        }
        strReturn += size() != 0 ? "(Return to the beginnig)" : "[]";
        return strReturn;

    }
}