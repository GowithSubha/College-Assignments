package week_8;

//50. Write a Java Program to Count Number of Words in a given Text or Sentence.
import java.util.Scanner;

public class Q_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String or Sentence: ");
        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        int count = 0;
        for (String word : words)
            count++;
        System.out.println("Number of Words: " + count);
    }
}
