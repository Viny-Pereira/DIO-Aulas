package circular_liked_list;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<String> myCircularLinkedList = new CircularLinkedList<>();

        myCircularLinkedList.add("node1");
        System.out.println(myCircularLinkedList);

        myCircularLinkedList.remove(0);
        System.out.println(myCircularLinkedList);

        myCircularLinkedList.add("node2");
        System.out.println(myCircularLinkedList);

        myCircularLinkedList.add("node2");
        myCircularLinkedList.add("node3");
        System.out.println(myCircularLinkedList);

        System.out.println(myCircularLinkedList.get(2));
        System.out.println(myCircularLinkedList.get(3));
        System.out.println(myCircularLinkedList.get(100));
    }
}
