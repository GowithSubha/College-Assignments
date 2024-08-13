package week_8;

import java.util.Scanner;

//38. Write a Java Program to Access the Characters or the ASCII of the Character Available in the String.
public class Q_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        // Access the Characters and their ASCII values
        for (int i = 0; i < str.length(); i++)
            System.out.println(str.charAt(i) + " at position " + i + " and ASCII value -> " + (int)str.charAt(i));
    }
}
