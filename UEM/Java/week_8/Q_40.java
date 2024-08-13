package week_8;

import java.util.Scanner;

//40. Write a Java Program to Accept 2 String & Check Whether all Characters in First String is Present in Second String & Print
public class Q_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First String: ");
        String str_1 = sc.nextLine();
        System.out.print("Enter the Second String: ");
        String str_2 = sc.nextLine();
        sc.close();
        for (int i = 0; i < str_1.length(); i++) {
            char ch = str_1.charAt(i);
            if (str_2.indexOf(ch) == -1) {
                System.out.println("All characters of First string is not present in the Second String.");
                return;
            }
        }
        System.out.println("All characters of First String is present in the Second String.");
    }
}
