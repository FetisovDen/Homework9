package Homework9;

public class Main {
    public static void main(String[] args) {

        Author GeorgeOrwell = new Author("George","Orwell");
        Book AnimalFarm = new Book("AnimalFarm", GeorgeOrwell, 1945);

        Author GogolNikolai = new Author("Gogol","Nikolai");
        Book Inspector = new Book("Inspector", GogolNikolai, 1835);
        Inspector.setPublishingYear(1842);







    }
}
