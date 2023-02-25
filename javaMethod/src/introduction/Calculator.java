package introduction;

public class Calculator {
    public static void add(double number1, double number2) {
        double result = number1 + number2;
        System.out.println(result);
    }

    public static void subtract(double number1, double number2) {
        double result = number1 - number2;
        System.out.println(result);
    }

    public static void multiply(double number1, double number2) {
        double result = number1 * number2;
        System.out.println(result);
    }

    public static void divide(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Division by zero is indeterminate");
        } else {
            double result = number1 / number2;
            System.out.println(result);
        }

    }
}
