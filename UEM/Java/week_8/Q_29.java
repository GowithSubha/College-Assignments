package week_8;

//29. Write a Java Program to Remove all Characters in Second String which are Present in First String.

import java.util.HashSet;
import java.util.Scanner;

public class Q_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str_1 = sc.nextLine();
        System.out.print("Enter second String: ");
        String str_2 = sc.nextLine();
        HashSet<Character> charSet = new HashSet<>();
        for (char ch : str_1.toCharArray())
            charSet.add(ch);
        StringBuilder rmStr = new StringBuilder();
        for (char ch : str_2.toCharArray())
            if (!charSet.contains(ch))
                rmStr.append(ch);

        System.out.println("Second String After removing characters -> "+ rmStr.toString());
    }
}
