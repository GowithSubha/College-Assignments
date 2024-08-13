package week_8;

//23. Write a Java Program to Search a Particular Word in a String.
//Same as Q_21

import java.util.Scanner;

public class Q_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();
        System.out.print("Enter the word want to search: ");
        String searchWord = scanner.next();
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (word.equals(searchWord)) {
                System.out.println(searchWord + " is present in the String " + str);
                return;
            }
        }
        System.out.println(searchWord + " is not present in the String " + str);
    }
}
