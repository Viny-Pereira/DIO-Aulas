import javax.swing.*;

public class CustomizeException2 {
    public static void main(String[] args) {
        int[] numerator = { 4, 5, 8, 10 };
        int[] denominator = { 2, 4, 0, 2, 8 };

        for (int i = 0; i < denominator.length; i++) {
            try {
                if (numerator[i] % 2 != 0)
                    throw new DivisionNotExact("Division not exact!", numerator[i], denominator[i]);

                int resultado = numerator[i] / denominator[i];
                System.out.println(resultado);
            } catch (DivisionNotExact | ArithmeticException | ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

    }
}
