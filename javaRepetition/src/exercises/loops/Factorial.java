package exercises.loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int result = 1;

            System.out.println("Enter the factorial ");
            int factorial = scan.nextInt();

            for (int i = factorial; i >= 1; i--) {
                result *= i;
            }
            System.out.println(factorial + "! = " + result);
        }
    }
}
