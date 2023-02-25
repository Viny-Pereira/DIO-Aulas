package returning;

public class Quadrilateral {
    public static double area(double side) {
        double poligonalArea = side * side;
        return poligonalArea;
    }

    public static double area(double width, double heigth) {
        double poligonalArea = width * heigth;
        return poligonalArea;
    }

    public static double area(double minorSide, double majorSide, double heigth) {
        double poligonalArea = (minorSide + majorSide) * heigth / 2;
        return poligonalArea;
    }
}
