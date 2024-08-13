/*Program to implement the Multiple Inheritance (Exam Interface, Student & Result classes).*/
import java.util.Scanner;

interface Exam {
    void conductExam(); 
}

class Student {
    protected String name;
    protected int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

class Result extends Student implements Exam {
    private double marks;

    public Result(String name, int rollNumber, double marks) {
        super(name, rollNumber);
        this.marks = marks;
    }

    public void conductExam() {
        System.out.println("Exam conducted for " + name + " (Roll Number: " + rollNumber + ")");
    }

    public void displayResult() {
        System.out.println("Result for " + name + " (Roll Number: " + rollNumber + "): " + marks);
    }
}

public class Q_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Roll Number:");
        int rollNumber = scanner.nextInt();

        System.out.println("Enter Exam Marks:");
        double marks = scanner.nextDouble();

        Result result = new Result(name, rollNumber, marks);

        result.conductExam();

        result.displayResult();

        scanner.close();
    }
}
