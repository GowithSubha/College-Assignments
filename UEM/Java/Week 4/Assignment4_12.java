// Combine Question number 10 and 11 and have all the three classes together. Now describe the working of all classes.
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
class OctNum extends Num {
    public OctNum(int number) {
        super(number);
    }
    public void showNum() {
        System.out.println("Octal Value: " + Integer.toOctalString(number));
    }
}
public class Assignment4_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        HexNum hexNum = new HexNum(number);
        OctNum octNum = new OctNum(number);
        scanner.close();
        System.out.println("Hexadecimal:");
        hexNum.showNum();
        System.out.println("Octal:");
        octNum.showNum();
    }
}
