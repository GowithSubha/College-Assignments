package week_8;

import java.util.Scanner;
//41. Write a Java Program to Check whether a Given Character is Present in a String, Find Frequency & Position of Occurrence.
public class Q_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter the character to check: ");
        char ch = sc.next().charAt(0);
        if (str.indexOf(ch) == -1) {
            System.out.println("The given Character " + ch + " is not present in the string -> " + str);
            return;
        }
        System.out.print(ch + " is present in the place of -> ");
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
                System.out.print(i + ", ");
            }
        }
        System.out.println("\b\b\nFrequency of " + ch + " is " + count);
    }
}
