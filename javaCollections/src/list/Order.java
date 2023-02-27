package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Order {
    public static void main(String[] args) {
        List<Cat> myCats = new ArrayList<>() {
            {
                add(new Cat("Jon", 12, "Black"));
                add(new Cat("Simba", 6, "Tabby"));
                add(new Cat("Jon", 18, "Yellow"));

            }
        };
        System.out.println("--\tInsert Order\t---");
        System.out.println(myCats);

        System.out.println("--\tRandom Ordem\t---");
        Collections.shuffle(myCats);
        System.out.println(myCats);

        System.out.println("--\t Natural Order (Name)\t---");
        // Collections.sort(myCats);
        System.out.println(myCats);

        System.out.println("--\tAge Order\t---");
        Collections.sort(myCats, new ComparatorAge());
        // myCats.sort(new ComparatorAge());
        System.out.println(myCats);

        System.out.println("--\tOrdem cor\t---");
        // Collections.sort(myCats, new ComparatorCor());
        // myCats.sort(new ComparatorColor());
        System.out.println(myCats);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        // Collections.sort(myCats, new ComparatorNomeCorIdade());
        // myCats.sort(new ComparatorNameColorAge());
        System.out.println(myCats);
    }
}

class Cat implements Comparable<Cat> {
    private String name;
    private Integer age;
    private String color;

    public Cat(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{name=" + name + ", age=" + age + ", color=" + color + "}";
    }

    @Override
    // Set Natural Order
    public int compareTo(Cat cat) {
        return this.getName().compareTo(cat.name);
    }

}

class ComparatorAge implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return Integer.compare(cat1.getAge(), cat2.getAge());
    }
}

class ComparatorColor implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getColor().compareTo(cat2.getColor());
    }
}

class ComparatorNameColorAge implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        int name = cat1.getName().compareToIgnoreCase(cat2.getName());
        if (name != 0)
            return name;
        int color = cat1.getColor().compareTo(cat2.getColor());
        if (color != 0)
            return color;
        return Integer.compare(cat1.getAge(), cat2.getAge());
    }
}