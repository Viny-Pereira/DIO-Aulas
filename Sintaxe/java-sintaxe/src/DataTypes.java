public class DataTypes {
    public static void main(String[] args) {
        byte age = 123;
        short year = 2023;
        int cp = 60000000;
        long cpf = 630_000_000_000L; // use L to force the long type
        float PI = 3.14F; // F to force the float type
        double income = 1200.50;
        System.out.println(age + year + cp + cpf + PI + income);
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // casting
        System.out.println(numeroCurto2);
        // constant
        final double VALOR_PI = 3.14;
        System.out.println(VALOR_PI);
    }
}
