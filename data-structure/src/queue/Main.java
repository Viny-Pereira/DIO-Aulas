package queue;

public class Main {
    public static void main(String[] args) {

        Queue myQueue = new Queue();

        myQueue.enqueue(new Node("first"));
        myQueue.enqueue(new Node("second"));
        myQueue.enqueue(new Node("third"));
        myQueue.enqueue(new Node("fourth"));

        System.out.println(myQueue);
    }
}
