package week_8;

import java.util.*;

//26. Write a Java Program to Delete All Repeated Words in String.
public class Q_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String(with repeated words): ");
        String str = sc.nextLine();
        String[] words = str.split("\\s+");

        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
        StringBuilder newstr = new StringBuilder();
        for (String word : uniqueWords)
            newstr.append(word).append(" ");

        System.out.println("After removing the repeated word the String is -> " + newstr.toString());
    }
}
