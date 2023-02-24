package linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("info1");
        myLinkedList.add("info2");
        myLinkedList.add("info3");
        myLinkedList.add("info4");

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList);

        // System.out.println(myLinkedList.get(4));

        System.out.println(myLinkedList.remove(3));
        System.out.println(myLinkedList);

    }
}
