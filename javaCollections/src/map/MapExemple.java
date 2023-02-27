package map;

import java.util.*;

public class MapExemple {
    public static void main(String[] args) {
        Map<String, Double> cars = new HashMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(cars.toString());
        cars.put("gol", 15.2);
        System.out.println(cars);

        System.out.println("Contai tucson: " + cars.containsKey("tucson"));
        System.out.println("Consumption uno: " + cars.get("uno"));

        Set<String> models = cars.keySet();
        System.out.println("Models: " + models);

        Collection<Double> consumption = cars.values();
        System.out.println("Consumptions: " + consumption);

        Double consumptionsEfficientier = Collections.max(cars.values());
        Set<Map.Entry<String, Double>> entries = cars.entrySet();
        String modelEfficientier = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumptionsEfficientier)) {
                modelEfficientier = entry.getKey();
                System.out.println("Efficientier model: " + modelEfficientier + " - " + consumptionsEfficientier);
            }
        }

        Double consumptionsinefficientier = Collections.min(cars.values());
        String modelInefficientier = "";

        for (Map.Entry<String, Double> entry : cars.entrySet()) {
            if (entry.getValue().equals(consumptionsinefficientier)) {
                modelInefficientier = entry.getKey();
                System.out.println("Inefficientier model: " + modelInefficientier + " - " + consumptionsinefficientier);
            }
        }

        Iterator<Double> iterator = cars.values().iterator();
        Double sum = 0d;
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println("Value sum: " + sum);

        Iterator<Double> iteratorLess15_6 = cars.values().iterator();
        while (iteratorLess15_6.hasNext()) {
            if (iteratorLess15_6.next().equals(15.6))
                iteratorLess15_6.remove();
        }
        System.out.println(cars);

        Map<String, Double> carsInsertOrder = new LinkedHashMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(carsInsertOrder);

        Map<String, Double> carGrowingOrder = new TreeMap<>(carsInsertOrder);
        System.out.println(carGrowingOrder.toString());

    }
}
