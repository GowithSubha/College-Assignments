public class Q10 {
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public void method1() {
        synchronized (lock1) {
            System.out.println("Thraed 1 : holding lock 1...");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("Thraed 1 : waiting for lock 2...");

            synchronized (lock2) {
                System.out.println("Thraed 1 : holding lock 1 & 2...");
            }
        }
        // return null;
    }

    public void method2() {
        synchronized (lock1) {
            System.out.println("Thraed 2 : holding lock 1...");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("Thraed 2 : waiting for lock 1...");

            synchronized (lock2) {
                System.out.println("Thraed 2 : holding lock 1 & 2...");
            }
        }
        // return null;
    }

    public static void main(String[] args) {
        Q10 q10 = new Q10();

        Thread t1 = new Thread(q10::method1);
        Thread t2 = new Thread(q10::method2);

        t1.start();
        t2.start();
    }
}
