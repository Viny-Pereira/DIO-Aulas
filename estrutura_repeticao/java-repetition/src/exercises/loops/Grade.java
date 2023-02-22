package exercises.loops;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            float grade;
            while (true) {
                System.out.println("Insert your grande");
                grade = scan.nextFloat();
                if (grade < 0 || grade > 10) {
                    System.out.println("Invalid grade!");
                    continue;
                }
                break;
            }
            System.out.println("Your grade is " + grade);
        }
    }
}
