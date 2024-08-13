public class Q17 {
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnable(), "MyThread");
        myThread.setPriority(Thread.MAX_PRIORITY);

        myThread.start();

        int threadPriority = myThread.getPriority();
        System.out.println("Thread Priority: " + threadPriority);
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread is running with priority: " + Thread.currentThread().getPriority());
        }
    }
}
