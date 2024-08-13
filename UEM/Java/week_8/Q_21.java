package week_8;

//21. Write a Java Program to Search a Word Inside a String.
import java.util.Scanner;

public class Q_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();
        System.out.print("Enter the word want to search: ");
        String word = scanner.next();
        if (str.contains(word))
            System.out.println(word +" is present in the String " + str);
        else System.out.println(word +" is not present in the String " + str);
    }
}
