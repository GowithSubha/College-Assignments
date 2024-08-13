package week_8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//49. Write a Java Program to Count a Group of Words in a String.
public class Q_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.print("Enter the group of words: ");
        String words = sc.nextLine();

        Pattern pattern = Pattern.compile("\\b" + words + "\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find())
            count++;
        System.out.println("No of " + words + " found in " + str + " is = " + count);
    }
}
