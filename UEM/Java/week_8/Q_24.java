package week_8;

import java.util.Scanner;

//24. Write a Java Program to Replace All Occurings of a String.
public class Q_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter the String want to remove: ");
        String oldSubString = sc.nextLine();
        System.out.print("Enter the String want to replace with: ");
        String newSubString = sc.nextLine();
        if (!str.contains(oldSubString)) {
            System.out.println(oldSubString + " is not Present in the given String -> " + str);
            return;
        }
        str = str.replaceAll(oldSubString, newSubString);
        System.out.println("String After replacement is: " + str);
    }
}
/*
Output:
Enter a String: java program is the best program in the program world
Enter the String want to remove: program
Enter the String want to replace with: language
String After replacement is: java language is the best language in the language world
 */