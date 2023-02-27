package list;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TemperatureAverage {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            List<String> months = Arrays.asList("January", "Fevruary", "March", "April", "May", "June", "July",
                    "August",
                    "Septemper", "Octuber", "November", "December");
            List<Double> monthTemperature = new ArrayList<>();

            double sum = 0d;

            double average = 0d;
            for (int i = 0; i < 6; i++) {
                System.out.print("Insert temperature of " + months.get(i) + ": ");
                double temperature = scan.nextDouble();
                monthTemperature.add(temperature);
                sum += temperature;
            }
            average = sum / monthTemperature.size();
            System.out.println("-----------------");
            System.out.println("Average: " + average);
            System.out.println("-----------------");
            for (Double temperature : monthTemperature) {
                if (temperature > average) {
                    int index = monthTemperature.indexOf(temperature);
                    System.out.println(months.get(index) + " - " + temperature);
                }
            }
        }

    }
}
