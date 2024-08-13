package week_8;

import java.util.Scanner;

//22. Write a Java Program to Split a String into a Number of Substrings.
public class Q_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter the delimiter: ");
        String delimiter = sc.nextLine();
        String[] substrings = str.split(delimiter);
        System.out.println("The substrings are: ");
        for (String substring : substrings)
            System.out.println(substring);
    }
}
