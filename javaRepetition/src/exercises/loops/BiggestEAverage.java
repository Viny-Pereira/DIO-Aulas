package exercises.loops;

import java.util.Scanner;

public class BiggestEAverage {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int number;
            int sum = 0;
            int average;
            int biggest = 0;

            for (int i = 0; i < 5; i++) {
                System.out.println("Insert the " + (i + 1) + "º number");
                number = scan.nextInt();
                sum += number;
                if (number > biggest)
                    biggest = number;
            }
            average = sum / 5;
            System.out.println("Average of this grade is " + average);
            System.out.println("The biggest number is " + biggest);
        }

    }
}