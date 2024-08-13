package week_8;

import java.util.Scanner;

//20. Write a Java Program to Reverse a String.
// Same as Q_4
public class Q_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        sc.close();
        StringBuilder revStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            revStr.append(str.charAt(i));

        System.out.println("Reversed String is: " + revStr);
    }
}
