package week_8;

import java.util.Scanner;

class Palindrome {
    String palindrome;

    Palindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        palindrome = scanner.next();
        scanner.close();
    }

    void checkPalindrome() {
        int len = palindrome.length();
        for (int i = 0; i < len / 2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(len - i - 1)) {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}

public class Q_2 {
    public static void main(String[] args) {        
        Palindrome palindrome = new Palindrome();
        palindrome.checkPalindrome();
    }
}

//output:
//Enter the String: madam
//Palindrome
