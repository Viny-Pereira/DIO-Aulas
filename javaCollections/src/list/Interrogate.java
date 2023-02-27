package list;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Interrogate {
    public static void main(String[] args) {

        List<String> answers = new ArrayList<>();
        List<String> asks = Arrays.asList("Did you call the victim?", "Were you at the crime scene?",
                "Do you live near the victim?", "Owed to victim?", "Have you ever worked with the victim?");
        List<String> sentence = Arrays.asList("Innocent", "Suspect", "Accomplice", "Muderer");
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Questions");

            for (int i = 0; i < 5; i++) {
                System.out.println(asks.get(i));
                String answer = scan.next();
                answers.add(answer.toLowerCase());
            }
            int count = 0;
            Iterator<String> counter = answers.iterator();
            while (counter.hasNext()) {
                String resp = counter.next();
                if (resp.contains("y")) {
                    count++;
                }
            }

            switch (count) {
                case 1:
                    count = 0;
                    break;
                case 2:
                    count = 1;
                    break;
                case 3:
                case 4:
                    count = 2;
                    break;
                case 5:
                    count = 3;
                    break;

            }
            System.out.println("Your are " + sentence.get(count));
        }

    }

}
