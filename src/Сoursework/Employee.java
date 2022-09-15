package Сoursework;

public class Employee {
    private static int schetchik = 1;
    private final int id;
    private String fullname ;
    private double salary;
    private int department;

    public Employee(String fio, double salary, int department) {
        id = schetchik++;
        this.fullname = fio;
        this.salary = salary;
        this.department= department;
    }

    public int getId() {

        return id;
    }

    public String getFullname() {

        return fullname;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public int getDepartment() {

        return  department;
    }

    public void setDepartment(int department) {

        this.department = department;
    }

    public void setFio(String fio) {

        this.fullname = fio;
    }

    @Override
    public String toString() {
        return "id: " + id + ", Fullname: " + fullname + ", Salary: " + salary + ", Department: " + department;
    }


}
