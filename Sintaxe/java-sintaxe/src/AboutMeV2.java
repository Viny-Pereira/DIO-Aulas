import java.util.Locale;
import java.util.Scanner;

public class AboutMeV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insert your first name");
        String name = scanner.next();

        System.out.println("Insert your middle name");
        String middleName = scanner.next();

        System.out.println("Insert your age");
        int age = scanner.nextInt();

        System.out.println("Insert your heigth");
        double heigth = scanner.nextDouble();

        // java AboutMe Viny Pereira 21 1.80
        System.out.println("My name is " + name + middleName);
        System.out.println("I'm " + age + " years old");
        System.out.println("My height is " + heigth + "m");

        /*
         * My name is Viny Pereira
         * I'm 21 years old
         * My heigth is 1.80m
         */

    }
}
