package week_8;

//14. Write a Java Program to Use compareTo Method In a String Class.
public class Q_14 {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";

        int result1 = str1.compareTo(str2);
        System.out.println("Comparison of 'apple' and 'banana': " + result1);

        int result2 = str2.compareTo(str1);
        System.out.println("Comparison of 'banana' and 'apple': " + result2);

        int result3 = str1.compareTo(str3);
        System.out.println("Comparison of 'apple' and 'apple': " + result3);

    }
}
/*
Output:
Comparison of 'apple' and 'banana': -1
Comparison of 'banana' and 'apple': 1
Comparison of 'apple' and 'apple': 0
*/