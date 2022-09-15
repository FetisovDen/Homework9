package Hogwarts;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String fullname, int hardworking, int loyal, int honest, int powerOfMagic, int distanceOfTransgression) {
        super(fullname, powerOfMagic, distanceOfTransgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking (int hardworking) {
        this.hardworking = hardworking;
    }
    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }
    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public int sumOfQuality()  {
        return hardworking + loyal + honest;
    }

    public void comparisonStudentOfHufflepuff(Hufflepuff hufflepuff) {
        int first = sumOfQuality();
        int second = hufflepuff.sumOfQuality();
        if (first > second) {
            System.out.println( getFullname() +" лучший Гриффиндорец, чем " + hufflepuff.getFullname() );}
        else {
            System.out.println( hufflepuff.getFullname() +" лучший Гриффиндорец, чем " + getFullname());
        }
    }

    @Override
    public String toString() {
        return "Faculty - Hufflepuff  "+ super.toString()+
                " hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest ;
    }
}
