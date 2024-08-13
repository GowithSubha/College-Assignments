package week_8;

import java.util.Scanner;

//35. Write a Java Program to Count and Replace First Occurrence of a String
public class Q_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Sample String -> "Hello world, hello universe, hello everyone"
        System.out.print("Enter a String: ");
        String originalString = sc.nextLine();
        System.out.print("Enter which string want to replace: ");
        //Sample String -> "hello"
        String substringToReplace = sc.nextLine();
        System.out.print("Enter the string want to replace with: ");
        //Sample String -> "hi"
        String replacementString = sc.nextLine();

        System.out.println("Original string: " + originalString);

        int index = originalString.indexOf(substringToReplace);
        if (index != -1) {
            // Count the occurrence of the substring
            int count = 0;
            int fromIndex = 0;
            while ((index = originalString.indexOf(substringToReplace, fromIndex)) != -1) {
                count++;
                fromIndex = index + substringToReplace.length();
            }

            // Replace the first occurrence of the substring
            String replacedString = originalString.replaceFirst(substringToReplace, replacementString);
            System.out.println("Replaced string: " + replacedString);
            System.out.println("Total occurrences replaced: " + count);
        } else {
            System.out.println("Substring not found in the original string.");
        }
    }
}
