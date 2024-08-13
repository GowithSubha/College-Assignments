package week_8;

import java.util.Scanner;

//42. Write a Java Program to Count the Number of Occurrence of Each Character Ignoring the Case of Alphabets & Display them.
public class Q_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        int[] charArr = new int[256];
        for (char ch : str.toLowerCase().toCharArray())
            charArr[ch]++;
        for (int i = 0; i < charArr.length; i++) {
            char ch = (char) i;
            if (charArr[ch] > 0)
                System.out.println("'" + ch + "' : " + charArr[ch]);
        }
    }
}
