package week_8;

//47. Write a Java Program to Verify a Class is StringBuffer Class Method.
public class Q_47 {
    public static boolean isStringBuffer(Object obj) {
        return obj != null && obj.getClass().equals(StringBuffer.class);
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("This is a StringBuffer");
        String string = "This is a String";

        System.out.println(stringBuffer.getClass() + " is StringBuffer? " + isStringBuffer(stringBuffer));
        System.out.println(string.getClass() + " is StringBuffer? " + isStringBuffer(string));
    }
}
