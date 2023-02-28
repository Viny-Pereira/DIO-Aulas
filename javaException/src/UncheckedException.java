import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        boolean looping = true;
        do {
            String numerator = JOptionPane.showInputDialog("Numerator");
            String denominator = JOptionPane.showInputDialog("Denominator");
            try {
                int result = divide(Integer.parseInt(numerator), Integer.parseInt(denominator));
                System.out.printf("Result: %d\n", result);
                looping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Insert a integer number!\n" + e.getMessage());
                // e.printStackTrace();
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Zero divided is not allowed");
            } finally {

                System.out.println("Finally!");
                ;
            }
        } while (looping);
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
