package week_8;

//46. Write a Java Program to Store String Literals Using String Buffer.
public class Q_46 {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer();

        // Append string literals to the StringBuffer
        stringBuffer.append("This ");
        stringBuffer.append("is ");
        stringBuffer.append("a ");
        stringBuffer.append("test.");

        // Print the result
        System.out.println("Result: " + stringBuffer.toString());
    }
}
