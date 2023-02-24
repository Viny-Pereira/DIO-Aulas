package pile;

public class Main {

    public static void main(String[] args) {

        Pile myPile = new Pile();

        myPile.push(new Node(1));
        myPile.push(new Node(2));
        myPile.push(new Node(3));
        myPile.push(new Node(4));
        myPile.push(new Node(5));
        myPile.push(new Node(6));
        System.out.println(myPile);

        System.out.println(myPile.pop());
        System.out.println(myPile);

        myPile.push(new Node(99));
        System.out.println(myPile);

    }

}
