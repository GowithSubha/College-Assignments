public class Q34 {
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnable(), "MyThread");
        myThread.start();

        // Get the name of the running thread
        String threadName = Thread.currentThread().getName();
        System.out.println("Current thread name: " + threadName);
    }

    static class MyRunnable implements Runnable {
        public void run() {
            String threadName = Thread.currentThread().getName();
            System.out.println("Running thread name: " + threadName);
        }
    }
}
