package exercises.arrays;

import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String[] consonants = new String[6];

            for (int i = 0; i < consonants.length; i++) {
                String letter = scan.next();
                switch (letter) {
                    case "a":
                        continue;
                    case "e":
                        continue;
                    case "i":
                        continue;
                    case "o":
                        continue;
                    case "u":
                        continue;
                    default:
                        consonants[i] = letter;
                }
            }
            System.out.print("Consonants: ");
            for (String consonant : consonants) {
                if (consonant != null)
                    System.out.print(consonant + " ");
            }
        }
    }
}
