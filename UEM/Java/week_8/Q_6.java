package week_8;

//6. Write a Java Program to check if a Given String is getChar from Specific Index

public class Q_6 {
    public static void main(String[] args) {
        String str = "Hello World";
        int index = 3;

        // Get the character at the specified index
        char c = str.charAt(index);

        // Check if the character is 'o'
        if (c == 'o') {
            System.out.println("The character at index " + index + " is 'o'");
        } else {
            System.out.println("The character at index " + index + " is not 'o'");
        }
    }
}
//output:
//The character at index 3 is not 'o'