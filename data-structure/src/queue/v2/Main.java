package queue.v2;

public class Main {
    public static void main(String[] args) {

        Queue<String> myQueue = new Queue<>();

        myQueue.enqueue("first");
        myQueue.enqueue("second");
        myQueue.enqueue("third");
        myQueue.enqueue("fourth");
        System.out.println(myQueue);

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue);

        myQueue.enqueue("last");
        System.out.println(myQueue);

        System.out.println(myQueue.first());
        System.out.println(myQueue);
    }
}
