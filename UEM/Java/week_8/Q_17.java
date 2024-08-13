package week_8;

//17. Write a Java Program to Search Last Occurance of a Substring Inside a Substring.
import java.util.Scanner;

public class Q_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();

        System.out.println("Enter the substring to search for:");
        String subString = scanner.nextLine();

        // Get the last occurrence index of the substring within the main string
        int lastIndex = lastIndexOfSubstring(mainString, subString);

        if (lastIndex != -1)
            System.out.println("Last occurrence of substring \"" + subString + "\" is at index: " + lastIndex);
        else
            System.out.println("Substring \"" + subString + "\" not found in the main string.");

        scanner.close();
    }

    // Method to find the last occurrence index of a substring within a string
    public static int lastIndexOfSubstring(String mainString, String subString) {
        int lastIndex = -1;
        int index = mainString.indexOf(subString);

        while (index != -1) {
            lastIndex = index;
            index = mainString.indexOf(subString, index + 1);
        }

        return lastIndex;
    }
}
