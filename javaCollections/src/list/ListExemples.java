package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExemples {
	public static void main(String[] args) {
		List<Double> grade = new ArrayList<>();

		grade.add(7.0);
		grade.add(8.5);
		grade.add(9.3);
		grade.add(5.0);
		grade.add(7.0);
		grade.add(0.0);
		grade.add(3.6);

		// System.out.println(grade);
		System.out.println(grade.toString());

		System.out.println(grade.indexOf(5d));
		System.out.println(grade.contains(5d));
		grade.add(grade.indexOf(5d), 4.0);
		System.out.println(grade.contains(5d));

		grade.add(3, 4.0);
		System.out.println(grade.toString());
		System.out.println(grade.toString());
		grade.get(3);

		// Não possui classe mínimo, máximo na collections ArraysList, porém é possivel
		// usar o collections
		Collections.min(grade);
		Collections.max(grade);

		// Por padrão não possuimos o somar, então faremos usando o Interator
		Iterator<Double> iterator = grade.iterator();
		Double sum = 0d;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			sum += next;
		}
		System.out.println(sum);
		double average = sum / grade.size();
		System.out.println(average);

		grade.remove(0d);

		System.out.println(grade.toString());
		grade.remove(0);

		System.out.println(grade.toString());

		// Removendo elementos menores do que 7
		Iterator<Double> iteratorLess7 = grade.iterator();
		while (iteratorLess7.hasNext()) {
			Double next = iteratorLess7.next();
			if (next < 7)
				iterator.remove();
		}
		System.out.println(grade.toString());

		grade.clear();
		System.out.println(grade.toString());
		System.out.println(grade.isEmpty());
	}

}