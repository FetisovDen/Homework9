package Hogwarts;

public class Main {
    public static void main(String[] args) {

        Gryffindor potter = new Gryffindor("Harry Potter",99,99,99,99,99);
        Gryffindor granger= new Gryffindor("Hermione Granger",5,6,7,9,19);
        Gryffindor weasley= new Gryffindor("Ron Weasley",8,9,15,21,25);

        Hufflepuff smith = new Hufflepuff("Zachariah Smith",11,2,5,11,21);
        Hufflepuff diggory = new Hufflepuff("Cedric Diggory",25,15,11,33,44);
        Hufflepuff finchFletchley= new Hufflepuff("Justin Finch-Fletchley",2,3,9,8,6);

         Ravenclaw chang = new Ravenclaw("Zhou Chang",5,9,3,1,9, 19);
         Ravenclaw patil = new Ravenclaw("Padma Patil",5,3,5,1,6,2);
         Ravenclaw belby = new Ravenclaw("Marcus Belby",8,2,4,7,24,9);

         Slytherin  malfoy  = new Slytherin("Draco Malfoy",9,9,9,9,9,6,11);
         Slytherin montague = new Slytherin("Graham Montague",1,2,3,4,5,11,55);
         Slytherin goyle = new Slytherin("Gregory Goyle",7,3,1,7,11,11,66);

        System.out.println(malfoy);
        goyle.comparisonStudentOfHogwarts(potter);
        granger.comparisonStudentOfGryffindor(weasley);
        chang.comparisonStudentOfRavenclaw(patil);

    }
}

