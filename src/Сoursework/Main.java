package Сoursework;

import static Сoursework.Main.EmployeeBook.employees;

public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Тарасов Ярослав Иванович", 89000, 1);
        employeeBook.addEmployee("Пучков Cемён Васильевич", 35000, 2);
        employeeBook.addEmployee("Романов Максим Иванович", 45000, 3);
        employeeBook.addEmployee("Мартынов Марк Иванович", 50000, 4);
        employeeBook.addEmployee("Виноградов Ян Серафимович", 70000, 5);


        printAllEmployee();
        System.out.println(getSumOfSalary());
        System.out.println(getMaxOfSalary());
        System.out.println(getMinOfSalary());
        System.out.println(getAvgOfSalary());
        printAllFullname();



    }

    public static double getSumOfSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;

    }

    public static double getMaxOfSalary() {
        double maxSum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSum) {
                maxSum = employee.getSalary();
            }
        }
        return maxSum;
    }

    public static double getMinOfSalary() {
        double minSum = getMaxOfSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSum) {
                minSum = employee.getSalary();
            }
        }
        return minSum;
    }

    public static double getAvgOfSalary() {
        double avgSum = 0;
        double numberOfEmployee= 0;

        for (Employee employee : employees) {
            if (employee != null) {
                numberOfEmployee = numberOfEmployee + 1;
            }
        }
        avgSum = getSumOfSalary()/numberOfEmployee;
        return avgSum;
    }

    public static void printAllEmployee() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void printAllFullname() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullname());
            }
        }
    }

    public static class EmployeeBook {
        public static Employee[] employees;
        int size;


        public EmployeeBook() {

            employees = new Employee[10];
        }

        public void addEmployee(String fullname, double salary, int departament) {
            Employee newEmployee = new Employee(fullname, salary, departament);
            employees[size++] = newEmployee;
        }


    }


}













    















