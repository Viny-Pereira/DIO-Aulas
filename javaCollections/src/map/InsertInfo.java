package map;

import java.util.*;

public class InsertInfo {
    public static void main(String[] args) {
        int quantityRelease = 100;

        List<Integer> values = new ArrayList<>();
        Random generatorRelease = new Random();
        for (int i = 0; i < quantityRelease; i++) {
            int number = generatorRelease.nextInt(6) + 1;
            values.add(number);
        }

        Map<Integer, Integer> release = new HashMap<>();
        for (Integer resultado : values) {
            if (release.containsKey(resultado))
                release.put(resultado, (release.get(resultado) + 1));
            else
                release.put(resultado, 1);
        }

        System.out.print("COMPUTING");
        // conteúdo do for + try/cath - totalmente opcional
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(300);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nVALUE " + " Quant. Repetitions");
        for (Map.Entry<Integer, Integer> entry : release.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
    }
}
