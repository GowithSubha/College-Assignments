package week_8;

//12. Write a Java Program to Use Equals Method In a String Class.

public class Q_12 {
    public static void main(String[] args) {
        String str1 = "Hello World!";
        String str2 = "Hello World!"; // Same content, different object
        String str3 = new String("Hello World!"); // Explicitly create a new object

        // Compare str1 and str2 (same content, different objects)
        if (str1.equals(str2))
            System.out.println("str1 and str2 are equal (same content)");
        else
            System.out.println("str1 and str2 are not equal (may refer to different objects)");

        // Compare str1 and str3 (same content, different objects)
        if (str1.equals(str3))
            System.out.println("str1 and str3 are equal (same content)");
        else
            System.out.println("str1 and str3 are not equal (may refer to different objects)");

        // Compare str1 and "Hello World!" (literal string)
        if (str1.equals("Hello World!"))
            System.out.println("str1 and \"Hello World!\" are equal (same content)");
        else
            System.out.println("str1 and \"Hello World!\" are not equal (unlikely scenario)");
    }
}
/*
OutPut:
str1 and str2 are equal (same content)
str1 and str3 are equal (same content)
str1 and "Hello World!" are equal (same content)
*/
