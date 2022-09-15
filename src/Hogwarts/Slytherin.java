package Hogwarts;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness ;
    private int thirstForPower;

    public Slytherin(String fullname, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower, int powerOfMagic, int distanceOfTransgression) {
        super(fullname, powerOfMagic, distanceOfTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition  = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
    public int getCunning() {
        return cunning;
    }

    public void setCunning (int cunning) {
        this.cunning = cunning;
    }
    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }
    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public int sumOfQuality()  {
        return cunning + determination + ambition + resourcefulness+ thirstForPower;
    }

    public void comparisonStudentOfSlytherin(Slytherin slytherin) {
        int first = sumOfQuality();
        int second = slytherin.sumOfQuality();
        if (first > second) {
            System.out.println( getFullname() +" лучший Слизеринец, чем " + slytherin.getFullname() );}
        else {
            System.out.println( slytherin.getFullname() +" лучший Слизеринец, чем " + getFullname());
        }
    }

    @Override
    public String toString() {
        return "Faculty -Slytherin "+ super.toString() +
                " cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower;
    }
}

