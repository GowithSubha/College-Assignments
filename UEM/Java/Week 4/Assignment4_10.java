// Write a Java program which creates a base class Num and contains an integer number along with a method shownum() which displays the number. Now create a derived class HexNum which inherits Num and overrides shownum() which displays the hexadecimal value of the number. Demonstrate the working of the classes.

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
class HexNum extends Num {
    public HexNum(int number) {
        super(number);
    }
    public void showNum() {
        System.out.println("Hexadecimal Value: " + Integer.toHexString(number));
    }
}
public class Assignment4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        HexNum hexNum = new HexNum(number);
        scanner.close();
        hexNum.showNum();
    }
}
