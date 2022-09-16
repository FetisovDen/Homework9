package Hogwarts;

public class Hogwarts {
    private String fullname;
    private int powerOfMagic;
    private int distanceOfTransgression;

    public Hogwarts(String fullname, int powerOfMagic, int distanceOfTransgression) {
        this.fullname = fullname;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }
    public int sumOfPower()  {
        return powerOfMagic + distanceOfTransgression;
    }

    public void comparisonStudentOfHogwarts(Hogwarts hogwarts) {
        int first = sumOfPower();
        int second = hogwarts.sumOfPower();
        if (first > second) {
            System.out.println( getFullname() +" обладает большей мощностью магии, чем " + hogwarts.getFullname() );}
            else {
                System.out.println( hogwarts.getFullname() +" обладает большей мощностью магии, чем " + getFullname());
            }


        }




    @Override
    public String toString() {
        return
                "Fullname:" + fullname  +
                ", powerOfMagic=" + powerOfMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +", ";
    }
}
