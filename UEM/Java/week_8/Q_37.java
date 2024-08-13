package week_8;

import java.util.Scanner;

//37. Write a Java Program to Access the Index of the Character or String.
public class Q_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter the character or string: ");
        String ch = sc.nextLine();
        int index = str.indexOf(ch);
        if (index == -1) {
            System.out.println(ch +" is not found in the String -> " + str);
            return;
        }
        System.out.println("Index of " + ch + " is -> " + index);
    }
}
