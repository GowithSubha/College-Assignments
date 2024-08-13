public class Q11 {
    public static void main(String[] args) {
        // Create two shared resources
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        // Create and start two threads accessing the shared resources
        Thread thread1 = new Thread(() -> {
            resource1.method1();
        });
        Thread thread2 = new Thread(() -> {
            resource2.method2();
        });

        thread1.start();
        thread2.start();
    }
}

class Resource {

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void method1() {
        synchronized (lock1) {
            System.out.println("Thread 1 acquired lock1");
            try {
                Thread.sleep(5000); // Introduce a delay to simulate some processing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock2) {
                System.out.println("Thread 1 acquired lock2");
            }
        }
    }

    public void method2() {
        synchronized (lock2) {
            System.out.println("Thread 2 acquired lock2");
            try {
                Thread.sleep(5000); // Introduce a delay to simulate some processing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock1) {
                System.out.println("Thread 2 acquired lock1");
            }
        }
    }
}
