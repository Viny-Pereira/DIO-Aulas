package introduction;

public class Loan {

    private static double getTax(int installments) {
        double multiplyTax = 0.15;
        double tax = multiplyTax * installments;
        return tax;
    }

    public static void calculete(double value, int installments) {
        double amountPay = value * (1 + getTax(installments));
        System.out.println("Amount of loan for " + installments + " installments: $ " + amountPay);
        ;
    }
}
