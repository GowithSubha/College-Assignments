package week_8;

import java.util.Scanner;

//28. Write a Java Program to Convert a String Totally into Upper Case.
public class Q_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        StringBuilder upperString = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
            upperString.append(Character.toUpperCase(str.charAt(i)));
        System.out.println("Upper cased String is -> " + upperString.toString());
    }
}
