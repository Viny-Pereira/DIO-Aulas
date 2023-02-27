package map;

import java.util.*;

public class States {
    public static void main(String[] args) {
        Map<String, Integer> populationStatesNE = new HashMap<>() {
            {
                put("PE", 9616621);
                put("AL", 3351543);
                put("CE", 9187103);
                put("RN", 3534265);
            }
        };
        System.out.println(populationStatesNE);

        populationStatesNE.put("RN", 3534165);
        System.out.println(populationStatesNE);

        populationStatesNE.put("PB", 4039277);
        System.out.println(populationStatesNE);

        System.out.println("PE State Population: " + populationStatesNE.get("PE"));

        System.out.println("Insert Order");
        Map<String, Integer> populationInsertOrder = new LinkedHashMap<>() {
            {
                put("PE", 9616621);
                put("AL", 3351543);
                put("CE", 9187103);
                put("RN", 3534265);
                put("PB", 4039277);
            }
        };
        System.out.println(populationInsertOrder);

        System.out.println("Alphabetic Order");
        Map<String, Integer> populationAlphabeticOrder = new TreeMap<>(populationStatesNE);
        System.out.println(populationAlphabeticOrder);

        Collection<Integer> population = populationStatesNE.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populationStatesNE.entrySet()) {
            if (entry.getValue().equals(Collections.max(population)))
                estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(population)))
                estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("Less population state (%s): %d\n",
                estadoMenorPopulacao, Collections.min(population));
        System.out.printf("More population state (%s): %d\n",
                estadoMaiorPopulacao, Collections.max(population));

        int sum = 0;
        Iterator<Integer> iterator = populationStatesNE.values().iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println("Population of NE " + sum);
        /*
         * int soma2 = 0;
         * for(Map.Entry<String, Integer> entry : populaçãoEstadosNE.entrySet()) {
         * soma2 += entry.getValue();
         * }
         */

        System.out.println(
                "Average State population: " + (sum / populationStatesNE.size()));

        Iterator<Integer> iteratorLess4M = populationStatesNE.values().iterator();
        while (iteratorLess4M.hasNext()) {
            if (iteratorLess4M.next() <= 4_000_000)
                iteratorLess4M.remove();
        }
        System.out.println("States of more than 4M of people: " + populationStatesNE);

        populationStatesNE.clear();
        System.out.println(populationStatesNE);

        System.out.println("Is Empty: " + populationStatesNE.isEmpty());
    }
}
