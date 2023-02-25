package car_project.list_;

import java.util.ArrayList;
import java.util.List;

import car_project.Car;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Ford"));
        carList.add(new Car("Chevrolet"));
        carList.add(new Car("Volkswagen"));

        System.out.println(carList.contains(new Car("Ford")));
        System.out.println(new Car("Ford").hashCode());
        System.out.println(new Car("Ford").hashCode());
    }
}
