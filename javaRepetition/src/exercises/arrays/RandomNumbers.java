package exercises.arrays;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int[] randomNumbers = new int[20];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }
        System.out.print("Numbers: ");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
    }
}
