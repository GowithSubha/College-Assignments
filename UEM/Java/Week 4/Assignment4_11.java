// Write a Java program which creates a base class Num and contains an integer number along with a method shownum() which displays the number. Now create a derived class OctNum which inherits Num and overrides shownum() which displays the octal value of the number. Demonstrate the working of the classes.

import java.util.Scanner;
class Num {
    protected int number;
    public Num(int number) {
        this.number = number;
    }
    public void showNum() {
        System.out.println("Number: " + number);
    }
}
class OctNum extends Num {
    public OctNum(int number) {
        super(number);
    }
    public void showNum() {
        System.out.println("Octal Value: " + Integer.toOctalString(number));
    }
}
public class Assignment4_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        OctNum octNum = new OctNum(number);
        scanner.close();
        octNum.showNum();
    }
}
