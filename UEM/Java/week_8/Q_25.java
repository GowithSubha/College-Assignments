package week_8;

import java.util.Scanner;

public class Q_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        StringBuilder newstr = new StringBuilder();
        for (String word : words) {
            char c = word.charAt(0);
            char ch = Character.toUpperCase(c);
            word = word.replace(Character.toString(c), Character.toString(ch));
            newstr.append(word);
            newstr.append(" ");
        }
        newstr = newstr.deleteCharAt(newstr.length() - 1);
        String str_2 = newstr.toString();
        System.out.println(str_2);
    }
}
