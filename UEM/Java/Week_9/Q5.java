import java.lang.reflect.*;

class MyClass extends Thread {
    public synchronized void run() {
        for (int i = 100; i < 104; i++) {
            System.out.println(i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("\nDone\n");
    }
}

public class Q5 {
    public static void main(String[] args) {
        try {
            Method method = MyClass.class.getMethod("run");

            boolean isSynchronized = Modifier.isSynchronized(method.getModifiers());

            System.out.println("Is run() method synchronized? " + isSynchronized);
            MyClass myclass = new MyClass();
            myclass.start();
        } catch (NoSuchMethodException e) {
            System.out.println("Error : The method run() could not be found.");
        }
    }
}