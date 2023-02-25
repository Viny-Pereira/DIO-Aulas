package introduction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Calculator.add(4, 2);
        Calculator.subtract(4, 2);
        Calculator.multiply(4, 2);
        Calculator.divide(4, 2);

        System.out.println("Mensage");
        Mensage.getMensage(11);
        Mensage.getMensage(15);
        Mensage.getMensage(19);

        System.out.println("Loan");

        Loan.calculete(1000, 2);
    }
}
