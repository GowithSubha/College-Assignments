package week_8;

import java.util.Scanner;

//31. Write a Java Program to Find the Largest & Smallest Word in a String.
public class Q_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        int max = words[0].length();
        int min = words[0].length();
        String maxWord = words[0], minWord = words[0];
        for (String word : words) {
            int len = word.length();
            if (len > max) {
                max = len;
                maxWord = word;
            }
            if (len < min) {
                min = len;
                minWord = word;
            }
        }
        System.out.println("Largest word is -> " + maxWord + "\nand Smallest word is -> " + minWord);
    }
}
