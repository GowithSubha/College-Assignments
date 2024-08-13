package week_8;

import java.util.Scanner;

//27. Write a Java Program to Reverse the String Using Both Recursion and Iteration.
public class Q_27 {
    public static String reverseString(String str) {
        if (str.isEmpty())
            return str;
        else
            return reverseString(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        StringBuilder revString = new StringBuilder();

        // Reverse using Iteration->
        for (int i = str.length() - 1; i >= 0; i--)
            revString.append(str.charAt(i));
        System.out.println("Reversed string (Using Iteration): " + revString.toString());
        // Reverse using Recursion->
        System.out.println("Reversed string (Using Recursion): " + reverseString(str));
    }
}
