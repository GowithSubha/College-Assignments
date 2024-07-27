// Write a program to define a class 'employee' with data members as empid, name
// and salary. Accept data for 5 objects using Array of objects and print it.
import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Week5_Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emps = new Employee[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the Employee ID: ");
            int empId = sc.nextInt();
            System.out.print("Enter the Employee Name: ");
            String empName = sc.next();
            System.out.print("Enter the Employee Salary: ");
            int salary = sc.nextInt();
            emps[i] = new Employee(empId, empName, salary);
        }
        for (Employee emp : emps) {
            emp.display();
        }
    }
}
