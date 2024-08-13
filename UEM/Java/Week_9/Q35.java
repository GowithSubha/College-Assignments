public class Q35 {
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnable());
        myThread.setName("MyThread");
        myThread.start();

        String threadName = myThread.getName();
        System.out.println("Thread name: " + threadName);
    }

    static class MyRunnable implements Runnable {
        public void run() {
            String threadName = Thread.currentThread().getName();
            System.out.println("Running thread name: " + threadName);
        }
    }
}
