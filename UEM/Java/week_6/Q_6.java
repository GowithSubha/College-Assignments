/*
Create an interface Department containing attributes deptName and deptHead. It also has abstract methods for printing the attributes. 
Create a class hostel containing hostelName, hostelLocation and numberofRooms. 
The class contains methods for getting and printing the attributes. 
Then write Student class extending the Hostel class and implementing the Department interface. 
This class contains attributes studentName, regdNo, electiveSubject and avgMarks. 
Write suitable getData and printData methods for this class. Also implement the abstract methods of the Department interface. 
Write a driver class to test the Student class. The program should be menu driven containing the options:
i) Admit new student
ii) Migrate a student
iii) Display details of a student
For the third option a search is to be made on the basis of the entered registration number.
 */
import java.util.*;
interface Department{
    String deptName = "";
    String deptHead = "";
    void printDeptInfo();
}
class Hostel{
    String hostelName;
    String hostelLocation;
    int numberofRooms;
    Scanner sc = new Scanner(System.in);

    Hostel(String hostelName, String hostelLocation, int numberofRooms){
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation ;
        this.numberofRooms = numberofRooms;
    }
    void getHostelData(){
        System.out.println("Enter Hostel Name:");
        hostelName = sc.nextLine();
        System.out.println("Enter Hostel Location :");
        hostelLocation = sc.nextLine();
        System.out.println("Enter Room Number :");
        numberofRooms = sc.nextInt();

    }
    void printHostelData(){
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberofRooms);
    }
}
class Student extends Hostel implements Department{
    String studentName; 
    int regdNo;
    String electiveSubject; 
    double avgMarks; 
    Scanner sc = new Scanner(System.in);
    Student(String hostelName, String hostelLocation, int numberofRooms, String studentName, int regdNo, String electiveSubject, double avgMarks){
        super(hostelName, hostelLocation, numberofRooms);
        this.studentName =studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }

    void getData(){
        System.out.println("Enter Student Name:");
        studentName = sc.nextLine();
        System.out.println("Enter Registration Number:");
        regdNo = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Enter Elective Subject:");
        electiveSubject = sc.nextLine();
        System.out.println("Enter Average Marks:");
        avgMarks = sc.nextDouble();
        getHostelData();
    }
    void printData(){
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        printHostelData();

    }
    public void printDeptInfo() {
        System.out.println("Dept. Info");
    }

}
public class Q_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Student> students = new HashMap<>();
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Admit new student");
            System.out.println("2. Migrate a student");
            System.out.println("3. Display details of a student");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice){
                case 1:
                    System.out.println("Enter Student Details");
                    Student st = new Student("", "", 0, "", 0, "", 0);
                    st.getData();
                    students.put(st.regdNo, st);
                    System.out.println("Student admitted....!!");
                    break;
                case 2:
                   System.out.println("Enter Student registration for migration :");
                   int migRegdNo = sc.nextInt();
                   if (students.containsKey(migRegdNo)){
                        students.remove(migRegdNo);
                        System.out.println("Student Migrated>>>>>");                    
                   }
                   else{
                    System.out.println("Migration Failed....!!");
                   }
                    break;
                case 3:
                    System.out.println("Enter registration number of the student to display details:");
                    int regdNoToDisplay = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    if (students.containsKey(regdNoToDisplay)) {
                      Student studentToDisplay = students.get(regdNoToDisplay);
                      studentToDisplay.printData();
                    } else {
                    System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    System.out.println("Exit...!!");
                    break;
                default: 
                    System.out.println("Invalid Input...!!!");
                    break;
            }
        }while(choice != 4);
    }
    
}
