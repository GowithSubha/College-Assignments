package week_8;

//7. . Write a Java Program to Find the Length of the String
import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String: ");
        String str = sc.nextLine();
        System.out.println("Length of the String is: " + str.length());
    }
}
/*
Output:
Enter A String:
Programming
Length of the String is: 11
*/