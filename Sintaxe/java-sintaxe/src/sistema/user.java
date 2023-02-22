package sistema;

public class user {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        System.out.println("Tv is on? " + smartTV.turnOn);
        System.out.println("Channel: " + smartTV.channel);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.turnOnTv();
        smartTV.decreaseVolume();
        smartTV.increaseVolume();
        smartTV.increaseChannel();
        smartTV.decreaseChannel();
        smartTV.toChannel(10);

        smartTV.turnOfTv();
        smartTV.decreaseVolume();
        smartTV.increaseVolume();
        smartTV.increaseChannel();
        smartTV.decreaseChannel();
        smartTV.toChannel(10);
    }
}
