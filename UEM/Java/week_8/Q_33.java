package week_8;

import java.util.Scanner;

//33. Write a Java Program to Display the Characters in Prime Position a Given String.
public class Q_33 {
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Characters of Prime Positions are->");
        for (int i = 0; i < str.length(); i++) {
            if (isPrime(i))
                System.out.print(str.charAt(i) + "\t");
        }
    }
}
