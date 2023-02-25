package doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> myLinkedList = new DoublyLinkedList<>();
        myLinkedList.add("node1");
        myLinkedList.add("node2");
        myLinkedList.add("node3");
        myLinkedList.add("node4");
        myLinkedList.add("node5");

        System.out.println(myLinkedList);

        myLinkedList.remove(3);
        System.out.println(myLinkedList);

        myLinkedList.add(3, "node4");
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(3));

    }
}
