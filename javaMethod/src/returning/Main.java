package returning;

public class Main {
    public static void main(String[] args) {
        System.out.println("Quadrilateral Area");
        double poligonalArea;
        poligonalArea = Quadrilateral.area(3);
        System.out.println("Square Area: "+poligonalArea);

        poligonalArea = (Quadrilateral.area(3, 2));
        System.out.println("Rectangule Area: "+poligonalArea);

        poligonalArea = (Quadrilateral.area(3, 2, 1));
        System.out.println("Trapezoide Area: "+poligonalArea);

    }
}
