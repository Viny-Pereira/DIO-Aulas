package set;

import java.util.*;

public class setOrder {
    public static void main(String[] args) {
        System.out.println("--\tRandom Order\t--");
        Set<Serie> mySerie = new HashSet<>() {
            {
                add(new Serie("got", "Fantasy", 60));
                add(new Serie("dark", "Drama", 60));
                add(new Serie("that '70s show", "Comedian", 25));
            }
        };
        for (Serie serie : mySerie)
            System.out.println(serie.getName() + " - "
                    + serie.getGender() + " - " + serie.getEpisodeTime());

        System.out.println("--\tInsert Order\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {
            {
                add(new Serie("got", "Fantasy", 60));
                add(new Serie("dark", "Drama", 60));
                add(new Serie("that '70s show", "Comedian", 25));
            }
        };
        for (Serie serie : minhasSeries1)
            System.out.println(serie.getName() + " - "
                    + serie.getGender() + " - " + serie.getEpisodeTime());

        System.out.println("--\tNatural Order (Episode Time)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2)
            System.out.println(serie.getName() + " - "
                    + serie.getGender() + " - " + serie.getEpisodeTime());

        System.out.println("--\tOrder Name/Gender/Episode Time\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNameGenderEpisodeTime());
        minhasSeries3.addAll(mySerie);
        for (Serie serie : minhasSeries3)
            System.out.println(serie.getName() + " - "
                    + serie.getGender() + " - " + serie.getEpisodeTime());
    }
}

class Serie implements Comparable<Serie> {
    private String name;
    private String gender;
    private Integer episodeTime;

    public Serie(String name, String gender, Integer episodeTime) {
        this.name = name;
        this.gender = gender;
        this.episodeTime = episodeTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getEpisodeTime() {
        return episodeTime;
    }

    public void setEpisodeTime(Integer episodeTime) {
        this.episodeTime = episodeTime;
    }

    @Override
    public String toString() {
        return "{name=" + name + ", gender=" + gender + ", episodeTime=" + episodeTime + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, episodeTime);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        return name.equals(other.name) && gender.equals(other.gender) && episodeTime.equals(other.episodeTime);
    }

    @Override
    public int compareTo(Serie serie) {
        int episodeTime = Integer.compare(this.getEpisodeTime(), serie.getEpisodeTime());
        if (episodeTime != 0)
            return episodeTime;
        return this.getGender().compareTo(serie.getGender());
    }

}

class ComparatorNameGenderEpisodeTime implements Comparator<Serie> {

    @Override
    public int compare(Serie serie1, Serie serie2) {
        int name = serie1.getName().compareTo(serie2.getName());
        if (name != 0)
            return name;
        int gender = serie1.getGender().compareTo(serie2.getGender());
        if (gender != 0)
            return gender;
        return Integer.compare(serie1.getEpisodeTime(), serie2.getEpisodeTime());

    }
}
