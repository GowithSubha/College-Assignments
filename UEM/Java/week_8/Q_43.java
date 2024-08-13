package week_8;

import java.util.Scanner;

//43. Write a Java Program to Give Shortest Sequence of Character Insertions and Deletions that Turn One String Into the Other.
public class Q_43 {

    public static int shortestSequence(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i <= str1.length(); i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= str2.length(); j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        int shortestSteps = shortestSequence(str1, str2);
        System.out.println("Shortest sequence of character insertions and deletions: " + shortestSteps);
    }
}
