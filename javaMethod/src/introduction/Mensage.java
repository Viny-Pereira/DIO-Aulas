package introduction;

public class Mensage {

    public static void getMensage(int hour) {
        switch (hour) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                returnMensageMorning();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                returnMensageAfterNoon();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                returnMensageNight();
                break;
            default:
                System.out.println("Invalid hour");
                break;

        }

    }

    private static void returnMensageNight() {
        System.out.println("Good Night!");

    }

    private static void returnMensageAfterNoon() {
        System.out.println("Good Afternoon!");
    }

    private static void returnMensageMorning() {
        System.out.println("Good Morning!");
    }

}
