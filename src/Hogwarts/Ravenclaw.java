package Hogwarts;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String fullname, int smart, int wise, int witty, int fullOfCreativity, int powerOfMagic, int distanceOfTransgression) {
        super(fullname, powerOfMagic, distanceOfTransgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }
    public int getSmart() {
        return smart;
    }

    public void setSmart (int smart) {
        this.smart = smart;
    }
    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }
    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }
    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    public int sumOfQuality()  {
        return smart + wise + witty + fullOfCreativity;
    }

    public void comparisonStudentOfRavenclaw(Ravenclaw ravenclaw) {
        int first = sumOfQuality();
        int second = ravenclaw.sumOfQuality();
        if (first > second) {
            System.out.println( getFullname() +" лучший Когтевранец, чем " + ravenclaw.getFullname() );}
        else {
            System.out.println( ravenclaw.getFullname() +" лучший Когтевранец, чем " + getFullname());
        }
    }

    @Override
    public String toString() {
        return "Faculty - Ravenclaw  "+ super.toString() +
                " smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", fullOfCreativity=" + fullOfCreativity;
    }
}
