package exercises.loops;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int quantityOfNumber;
            int number;
            int numberOdd = 0;
            int numberEven = 0;

            System.out.println("How many numbers do you want to enter");
            quantityOfNumber = scan.nextInt();

            for (int i = 0; i < quantityOfNumber; i++) {
                System.out.println("Enter a number: ");
                number = scan.nextInt();
                if (number % 2 == 0) {
                    numberEven++;
                    continue;
                }
                numberOdd++;
            }
            System.out.println("Odd numbers: " + numberOdd);
            System.out.println("Even numbers: " + numberEven);
        }
    }
}
