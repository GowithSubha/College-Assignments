package week_8;

import java.util.Arrays;
import java.util.Scanner;

//34. Write a Java Program to Sort String Ignoring Whitespaces and Repeating Characters Only Once.
public class Q_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        str = str.replaceAll(" ", ""); // Remove white spaces
        char[] ch = str.toCharArray();
        Arrays.sort(ch);  //Sorting elements
        //removing duplicate elements
        StringBuilder sortedString = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (i == 0 || ch[i] != ch[i - 1])
                sortedString.append(ch[i]);
        }
        System.out.println(sortedString);
    }
}
