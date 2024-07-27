// Write a program to demonstrate use of 'static' keyword.
import java.util.*;
public class Week5_Q19 {
    static int a;
    int b;
    static void display() {
        System.out.println("a = " + a);
    }
    void display2() {
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        Week5_Q19 obj = new Week5_Q19();
        display();
        obj.display2();
    }
}