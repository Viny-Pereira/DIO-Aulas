package set;

import java.util.*;

public class setExemple {
    public static void main(String[] args) {

        Set<Double> grade = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(grade.toString());

        System.out.println("Contain 5: " + grade.contains(5d));

        System.out.println(Collections.min(grade));
        System.out.println(Collections.max(grade));

        Iterator<Double> iterator = grade.iterator();
        Double sum = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            sum += next;
        }
        System.out.println(sum);

        Double average = sum / grade.size();
        System.out.println(average);

        grade.remove(0d);
        System.out.println(grade.toString());

        Iterator<Double> iteratorLess7 = grade.iterator();
        while (iteratorLess7.hasNext()) {
            Double next = iteratorLess7.next();
            if (next < 7)
                iteratorLess7.remove();
        }
        System.out.println(grade);

        Set<Double> gradeInsertOrder = new LinkedHashSet<>();
        gradeInsertOrder.add(7d);
        gradeInsertOrder.add(8.5);
        gradeInsertOrder.add(9.3);
        gradeInsertOrder.add(5d);
        gradeInsertOrder.add(7d);
        gradeInsertOrder.add(0d);
        gradeInsertOrder.add(3.6);
        System.out.println(gradeInsertOrder);

        Set<Double> gradeGrowingOrder = new TreeSet<>(gradeInsertOrder);
        System.out.println(gradeGrowingOrder);

        grade.clear();

        System.out.println("Hash set grade is empty: " + grade.isEmpty());
        System.out.println("Linked hash set grade is empty: " + gradeInsertOrder.isEmpty());
        System.out.println("Tree set grade is empty: " + gradeGrowingOrder.isEmpty());

    }
}
