// Write a program to demonstrate use of 'this' keyword.

import java.util.Scanner;
public class Week5_Q18 {
    int a, b;
    Week5_Q18(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void display() {
        System.out.println("a = " + a + ", b = " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        Week5_Q18 obj = new Week5_Q18(a, b);
        obj.display();
    }
}
