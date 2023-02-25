package car_project.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Car> queueCar = new LinkedList<Car>();

        queueCar.add(new Car("Ford"));
        queueCar.add(new Car("Chevrolet"));
        queueCar.add(new Car("Fiat"));

        System.out.println(queueCar.add(new Car("Peugeot")));
        System.out.println(queueCar);

        System.out.println(queueCar.element());
        System.out.println(queueCar);

        System.out.println(queueCar.offer(new Car("Renoult")));
        System.out.println(queueCar);

        System.out.println(queueCar.peek());
        System.out.println(queueCar);
        System.out.println(queueCar.remove());
        System.out.println(queueCar);

        System.out.println(queueCar.poll());
        System.out.println(queueCar);

        System.out.println(queueCar.isEmpty());
    }
}
