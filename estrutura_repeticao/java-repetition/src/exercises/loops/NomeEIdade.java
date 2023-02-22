package exercises.loops;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String name;
            int age;
            while (true) {
                System.out.println("Name: ");
                name = scan.next();
                if (name.equals("0"))
                    break;
                System.out.println("Age");
                age = scan.nextInt();
                if (age == 0)
                    break;
            }
        }
    }
}
