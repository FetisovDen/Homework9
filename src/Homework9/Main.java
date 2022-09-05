package Homework9;

public class Main {
    public static void main(String[] args) {

        Author georgeOrwell = new Author("George", "Orwell");
        Book animalFarm = new Book("AnimalFarm", georgeOrwell, 1945);

        Author gogolNikolai = new Author("Gogol", "Nikolai");
        Book inspector = new Book("Inspector", gogolNikolai, 1835);
        inspector.setPublishingYear(1842);




    }
}

