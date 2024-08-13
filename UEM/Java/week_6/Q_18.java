/* Java program to Perform Payroll Using Interface (Multiple Inheritance).*/
import java.util.Scanner;

interface Employee {
    double calculateSalary();
}

interface Taxable {
    double calculateTax();
}

class FullTimeEmployee implements Employee, Taxable {
    private String name;
    private double salary;
    private double taxRate;

    public FullTimeEmployee(String name, double salary, double taxRate) {
        this.name = name;
        this.salary = salary;
        this.taxRate = taxRate;
    }

    public double calculateSalary() {
        return salary;
    }

    public double calculateTax() {
        return (salary * taxRate) / 100;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Tax: " + calculateTax());
    }
}

public class Q_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Full-Time Employee Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Full-Time Employee Salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter Tax Rate:");
        double taxRate = scanner.nextDouble();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(name, salary, taxRate);

        System.out.println("Full-Time Employee Details:");
        fullTimeEmployee.displayDetails();

        scanner.close();
    }
}
