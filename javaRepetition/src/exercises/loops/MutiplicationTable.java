package exercises.loops;

import java.util.Scanner;

public class MutiplicationTable {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Insert the number of mutilication table do you want: ");
            int numberTable = scan.nextInt();

            System.out.println("Table of " + numberTable);
            for (int i = 1; i <= 10; i++) {
                System.out.println(numberTable + " X " + i + " = " + (i * numberTable));
            }

        }

    }
}
