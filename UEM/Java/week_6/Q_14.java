/*
 Write a program to implement the Multiple Inheritance (Gross Interface, Employee & Salary     
    classes).
 */
import java.util.Scanner;

interface Gross {
    double calculateGross();
}
class Employee {
    protected String name;
    protected int id;
    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class Salary extends Employee implements Gross {
    private double basicSalary;
    private double allowance;

    public Salary(String name, int id, double basicSalary, double allowance) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    public double calculateGross() {
        return basicSalary + allowance;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Allowance: " + allowance);
    }
}
public class Q_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Employee ID:");
        int id = scanner.nextInt();
        System.out.println("Enter Basic Salary:");
        double basicSalary = scanner.nextDouble();
        System.out.println("Enter Allowance:");
        double allowance = scanner.nextDouble();
        Salary salary = new Salary(name, id, basicSalary, allowance);


        System.out.println("Employee Details:");
        salary.displayDetails();

        double grossIncome = salary.calculateGross();
        System.out.println("Gross Income: " + grossIncome);

        scanner.close();
    }
}
