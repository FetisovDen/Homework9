package Hogwarts;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String fullname, int nobility, int honor, int bravery, int powerOfMagic, int distanceOfTransgression) {
        super(fullname, powerOfMagic, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }
    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public int sumOfQuality()  {
        return nobility + honor + bravery;
    }

    public void comparisonStudentOfGryffindor(Gryffindor gryffindor) {
        int first = sumOfQuality();
        int second = gryffindor.sumOfQuality();
        if (first > second) {
            System.out.println( getFullname() +" лучший Гриффиндорец, чем " + gryffindor.getFullname() );}
        else {
            System.out.println( gryffindor.getFullname() +" лучший Гриффиндорец, чем " + getFullname());
        }


    }




    @Override
    public String toString() {
        return "Faculty - Gryffindor "+ " " + super.toString() +" " +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }
}
