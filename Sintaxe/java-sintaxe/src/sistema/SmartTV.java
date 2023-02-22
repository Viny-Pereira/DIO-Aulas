package sistema;

public class SmartTV {
    boolean turnOn = false;
    int channel = 1;
    int volume = 25;

    public void turnOnTv() {
        turnOn = true;
    }

    public void turnOfTv() {
        turnOn = false;
    }

    public void increaseVolume() {
        if (turnOn) {
            volume++;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("TV off! \nVolume: 0");
        }

    }

    public void decreaseVolume() {
        if (turnOn) {
            volume--;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("TV off! \nVolume: 0");
        }
    }

    public void toChannel(int newChannel) {
        if (turnOn) {
            channel = newChannel;
            System.out.println("Channel: " + channel);
        } else {
            System.out.println("TV off!");
        }
    }

    public void increaseChannel() {
        if (turnOn) {
            channel++;
            System.out.println("Channel: " + channel);
        } else {
            System.out.println("TV off!");
        }
    }

    public void decreaseChannel() {
        if (turnOn) {
            channel--;
            System.out.println("Channel: " + channel);
        } else {
            System.out.println("TV off!");
        }
    }

}
