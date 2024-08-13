package week_8;

import java.util.Scanner;

//36. Write a Java Program to Know the Last Index of a Particular Word in a String.
public class Q_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter the Word: ");
        String word = sc.next();
        int index = str.indexOf(word) + word.length() - 1;
        if (index == -1) {
            System.out.println(word + " is not found in the String -> " + str);
            return;
        }
        System.out.println("Last Index of " + word + " is -> " + index);
    }
}
