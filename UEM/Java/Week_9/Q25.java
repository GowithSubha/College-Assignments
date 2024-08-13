public class Q25 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        try {
            Thread.sleep(2000);
            thread.suspend();
            System.out.println("Thread suspended.");

            Thread.sleep(2000);
            thread.resume();
            System.out.println("Thread resumed.");

            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e.getMessage());
        }
        System.out.println("Main thread finished.");
    }

    static class MyThread extends Thread {
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Count: " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
