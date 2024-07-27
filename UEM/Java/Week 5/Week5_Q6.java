// Write a program to define a class Employee to accept emp_id, emp _name, basic_salary from the user and display the gross_salary. 
import java.util.Scanner;
class Employee{
  int empId;
  String empName;
  double basicSalary;
  double DA = 0.05;
  double HRA = 0.10;

  Employee(int empId, String empName, double basicSalary){
    this.empId = empId;
    this.empName = empName;
    this.basicSalary = basicSalary;
  }
  void display(){
    System.out.println("Employee ID: " + empId);
    System.out.println("Employee Name: " + empName);
    System.out.println("Employee Gross Salary: " + (basicSalary + (basicSalary * DA) + (basicSalary * HRA)));
  }
}
public class Week5_Q6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Employee ID: ");
    int empId = sc.nextInt();
    System.out.print("Enter the Employee Name: ");
    String empName = sc.next();
    System.out.print("Enter the Employee Salary: ");
    int basicSalary = sc.nextInt();
    Employee emp = new Employee(empId, empName, basicSalary);
    emp.display();
  }
}
