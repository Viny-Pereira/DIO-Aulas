public class AboutMe {
    public static void main(String[] args) {
        String name = args[0];
        String middleName = args[1];
        int age = Integer.valueOf(args[2]);
        double heigth = Double.valueOf(args[3]);

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
