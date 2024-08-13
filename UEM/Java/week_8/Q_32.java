package week_8;

//32. Write a Java Program to Find First and Last Occurrence of Given Character in a String.

import java.util.Scanner;

public class Q_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter the character to check: ");
        char c = sc.next().charAt(0);
        int first = -1, last = -1;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                if (first == -1){
                    first = last = i;
                }
                else last = i;
            }
        }
        if (first == -1) {
            System.out.println("The given Character " + c + " is not present in the String.");
            return;
        }
        System.out.println("First occurrence is: " + first);
        System.out.println("Last occurrence is: " + last);
    }
}
