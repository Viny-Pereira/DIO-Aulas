package overloading;

public class Quadrilateral {
    public static void area(double side) {
        double poligonalArea = side * side;
        System.out.println("Square area: " + poligonalArea);
    }

    public static void area(double width, double heigth) {
        double poligonalArea = width * heigth;
        System.out.println("Rectangle area: " + poligonalArea);
    }

    public static void area(double minorSide, double majorSide, double heigth) {
        double poligonalArea = (minorSide + majorSide) * heigth / 2;
        System.out.println("Trapeze area: " + poligonalArea);
    }
}
