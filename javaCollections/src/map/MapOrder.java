package map;

import java.util.*;

public class MapOrder {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Book> myBook = new HashMap<>() {
            {
                put(" Hawking, Stephen", new Book("Uma Breve História do Tempo", 256));
                put(" Duhigg, Charles", new Book("O Poder do Hábito", 408));
                put(" Harari, Yuval Noah", new Book("21 Lições Para o Século 21", 432));
            }
        };
        for (Map.Entry<String, Book> book : myBook.entrySet())
            System.out.println(book.getKey() + " - " + book.getValue().getName());

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Book> myBookInsertOrder = new LinkedHashMap<>() {
            {
                put(" Hawking, Stephen", new Book("Uma Breve História do Tempo", 256));
                put(" Duhigg, Charles", new Book("O Poder do Hábito", 408));
                put(" Harari, Yuval Noah", new Book("21 Lições Para o Século 21", 432));
            }
        };
        for (Map.Entry<String, Book> book : myBookInsertOrder.entrySet())
            System.out.println(book.getKey() + " - " + book.getValue().getName());

        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Book> myBookGrowingOrder = new TreeMap<>(myBookInsertOrder);
        for (Map.Entry<String, Book> book : myBookGrowingOrder.entrySet())
            System.out.println(book.getKey() + " - " + book.getValue().getName());

        System.out.println("--\tOrdem alfabética nomes dos livros\t--");

        Set<Map.Entry<String, Book>> myBookAlphabeticOrder = new TreeSet<>(
                new ComparatorName());
        myBookAlphabeticOrder.addAll(myBook.entrySet());
        for (Map.Entry<String, Book> livro : myBookAlphabeticOrder)
            System.out.println(livro.getKey() + " - " + livro.getValue().getName());
    }
}

class Book {
    private String name;
    private Integer pages;

    public Book(String name, Integer pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return name.equals(other.name) && pages.equals(other.pages);
    }

    @Override
    public String toString() {
        return "{name=" + name + ", pages=" + pages + "}";
    }

}

class ComparatorName implements Comparator<Map.Entry<String, Book>> {
    @Override
    public int compare(Map.Entry<String, Book> book1, Map.Entry<String, Book> book2) {
        return book1.getValue().getName().compareToIgnoreCase(book2.getValue().getName());
    }
}