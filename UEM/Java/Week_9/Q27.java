public class Q27 {
    public static void main(String[] args) {
        ClassThread ct = new ClassThread();
        Thread thread = new Thread(ct);

        thread.start();
    }
}

class ClassThread implements Runnable {
    public void run() {
        System.out.println("I am run(), an overridden method of Runnable Interface.");
    }
}