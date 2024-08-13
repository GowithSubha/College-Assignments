package week_8;

//15. With a Java Program to Use compareToIgnoreCase Method In a String Class.

public class Q_15 {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "bAnAna";
        String str3 = "apple";

        int result1 = str1.compareToIgnoreCase(str2);
        System.out.println("Comparison of 'Apple' and 'bAnAna' (ignoring case): " + result1);

        int result2 = str2.compareToIgnoreCase(str1);
        System.out.println("Comparison of 'bAnAna' and 'Apple' (ignoring case): " + result2);

        int result3 = str1.compareToIgnoreCase(str3);
        System.out.println("Comparison of 'Apple' and 'apple' (ignoring case): " + result3);

    }
}
/*
Output:
Comparison of 'Apple' and 'bAnAna' (ignoring case): -1
Comparison of 'bAnAna' and 'Apple' (ignoring case): 1
Comparison of 'Apple' and 'apple' (ignoring case): 0
 */