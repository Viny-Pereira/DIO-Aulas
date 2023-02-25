package car_project.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Car> hashSetCar = new HashSet<Car>();

        hashSetCar.add(new Car("Ford"));
        hashSetCar.add(new Car("Chevrolet"));
        hashSetCar.add(new Car("Fiat"));
        hashSetCar.add(new Car("Peugeot"));
        hashSetCar.add(new Car("Zip"));
        hashSetCar.add(new Car("Alfa Romeo"));

        System.out.println(hashSetCar);

        Set<Car> treeSetCar = new TreeSet<Car>();

        treeSetCar.add(new Car("Ford"));
        treeSetCar.add(new Car("Chevrolet"));
        treeSetCar.add(new Car("Fiat"));
        treeSetCar.add(new Car("Peugeot"));
        treeSetCar.add(new Car("Zip"));
        treeSetCar.add(new Car("Alfa Romeo"));

        System.out.println(treeSetCar);

    }
}
