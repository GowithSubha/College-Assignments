import java.lang.reflect.*;

public class Q7 {
    public static void main(String[] args) {

        try {
            Method method = MyClass.class.getMethod("display");

            Method method1 = MyClass.class.getMethod("print");

            // Check if the method is synchronized
            if (Modifier.isSynchronized(method.getModifiers())) {
                System.out.println("The display() method in MyClass is synchronized.");
                System.out.print("Displaying : ");
                MyClass.display();
            } else {
                System.out.println("The display() method in MyClass is not synchronized.");
            }

            if (Modifier.isSynchronized(method1.getModifiers())) {
                System.out.println("The print() method in MyClass is synchronized.");
                System.out.print("Printing : ");
                MyClass.print();
            } else {
                System.out.println("The print() method in MyClass is not synchronized.");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found: " + e.getMessage());
        }
    }
}

class MyClass {
    public static synchronized void display() {
        System.out.println("Hii");
    }

    public static void print() {
        System.out.println("Hello");
    }
}
