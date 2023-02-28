
public class DivisionNotExact extends Exception {
    private int numerator;
    private int denominator;

    public void DivisionNotExactException(String message, int numerator, int denominator) {
        super(message);
        this.numerator = numerator;
        this.denominator = denominator;
    }

}
