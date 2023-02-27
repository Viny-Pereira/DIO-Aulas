package set;

import java.util.*;

public class FavoriteProgrammingLanguage {
    public static void main(String[] args) {
        Set<FavoriteLanguage> myFavoriteLanguage = new HashSet<>();
        myFavoriteLanguage.add(new FavoriteLanguage("Python", 1991, "Pycharm"));
        myFavoriteLanguage.add(new FavoriteLanguage("JavaScript", 1995, "IntelliJ"));
        myFavoriteLanguage.add(new FavoriteLanguage("Java", 1991, "Visual Studio Code"));

        Set<FavoriteLanguage> myFavoriteLanguageInsertOrder = new LinkedHashSet<>(
                Arrays.asList(
                        new FavoriteLanguage("Python", 1991, "Pycharm"),
                        new FavoriteLanguage("JavaScript", 1995, "IntelliJ"),
                        new FavoriteLanguage("Java", 1991, "Visual Studio Code")));
        for (FavoriteLanguage language : myFavoriteLanguageInsertOrder)
            System.out.println(language);

        Set<FavoriteLanguage> myFavoriteLanguageNameOrder = new TreeSet<>(myFavoriteLanguage);
        for (FavoriteLanguage language : myFavoriteLanguageNameOrder)
            System.out.println(language);

        Set<FavoriteLanguage> myFavoriteLanguageIDEOrder = new TreeSet<FavoriteLanguage>(new ComparatorIde());
        myFavoriteLanguageIDEOrder.addAll(myFavoriteLanguage);
        for (FavoriteLanguage language : myFavoriteLanguageIDEOrder)
            System.out.println(language);

        Set<FavoriteLanguage> myFavoriteLanguageOrderCriationName = new TreeSet<FavoriteLanguage>(
                new ComparatorCriationYearName());
        myFavoriteLanguageOrderCriationName.addAll(myFavoriteLanguage);
        for (FavoriteLanguage language : myFavoriteLanguageOrderCriationName)
            System.out.println(language);

        Set<FavoriteLanguage> myFavoriteLanguageOrderNameCriationIDE = new TreeSet<FavoriteLanguage>(
                new ComparatorNameCriationYearIDE());
        myFavoriteLanguageOrderNameCriationIDE.addAll(myFavoriteLanguageIDEOrder);
        for (FavoriteLanguage language : myFavoriteLanguageOrderNameCriationIDE)
            System.out.println(language);
    }
}

class FavoriteLanguage implements Comparable<FavoriteLanguage> {
    public String name;
    public Integer criationYear;
    public String ide;

    public FavoriteLanguage(String name, Integer criationYear, String ide) {
        this.name = name;
        this.criationYear = criationYear;
        this.ide = ide;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCriationYear() {
        return criationYear;
    }

    public void setCriationYear(Integer criationYear) {
        this.criationYear = criationYear;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((criationYear == null) ? 0 : criationYear.hashCode());
        result = prime * result + ((ide == null) ? 0 : ide.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FavoriteLanguage other = (FavoriteLanguage) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (criationYear == null) {
            if (other.criationYear != null)
                return false;
        } else if (!criationYear.equals(other.criationYear))
            return false;
        if (ide == null) {
            if (other.ide != null)
                return false;
        } else if (!ide.equals(other.ide))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "{name=" + name + ", criationYear=" + criationYear + ", ide=" + ide + "}";
    }

    @Override
    public int compareTo(FavoriteLanguage o) {
        return this.getName().compareTo(o.getName());
    }

}

class ComparatorCriationYearName implements Comparator<FavoriteLanguage> {

    @Override
    public int compare(FavoriteLanguage lf1, FavoriteLanguage lf2) {
        int criationYear = Integer.compare(lf1.getCriationYear(), lf2.getCriationYear());
        if (criationYear != 0)
            return criationYear;
        return lf1.getName().compareToIgnoreCase(lf2.getName());
    }
}

class ComparatorIde implements Comparator<FavoriteLanguage> {

    @Override
    public int compare(FavoriteLanguage lf1, FavoriteLanguage lf2) {
        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
    }
}

class ComparatorNameCriationYearIDE implements Comparator<FavoriteLanguage> {

    @Override
    public int compare(FavoriteLanguage lf1, FavoriteLanguage lf2) {
        int name = lf1.name.compareToIgnoreCase(lf2.name);
        int criationYear = Integer.compare(lf1.getCriationYear(), lf2.getCriationYear());
        if (name != 0)
            return name;
        if (criationYear != 0)
            return criationYear;
        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
    }
}