package car_project.queue;

import java.util.Objects;

public class Car {

    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Car))
            return false;
        Car car = (Car) o;
        return Objects.equals(getBrand(), car.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand());
    }

    @Override
    public String toString() {
        return "Car{brand=" + brand + "\'}";
    }

}
