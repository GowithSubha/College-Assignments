package week_8;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second String: ");
        String str2 = sc.nextLine();
        sc.close();
        System.out.println("Merged String: " + str1 + str2);
    }
}
//Output:
//Enter first String:
//Java
//Enter second String:
//Assignment
//Merged String: JavaAssignment