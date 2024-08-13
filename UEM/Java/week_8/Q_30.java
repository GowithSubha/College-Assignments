package week_8;

import java.util.Scanner;

//30. Write a Java Program to Find the Consecutive Occurrence of any Vowel in a String.
public class Q_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String v = "aeiouAEIOU";
        for (int i = 0; i < str.length() - 1; i++) {
            char first = str.charAt(i);
            char second = str.charAt(i + 1);
            if (v.contains(Character.toString(first)) && v.contains(Character.toString(second))){
                System.out.println("Consecutive vowels are-> " + first + "(" + i + ") and " + second + "(" + (i + 1) + ")");
            }
        }
    }
}
