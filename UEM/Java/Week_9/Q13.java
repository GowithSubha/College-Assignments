public class Q13 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnableThread(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnableThread(), "Thread 2");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();

        Thread mainThread = Thread.currentThread();
        System.out.println("Main Thread Name: " + mainThread.getName());
        System.out.println("Main Thread Priority: " + mainThread.getPriority());
    }

    static class MyRunnableThread implements Runnable {
        @Override
        public void run() {
            Thread currentThread = Thread.currentThread();
            System.out.println("Thread Name: " + currentThread.getName());
            System.out.println("Thread Priority: " + currentThread.getPriority());
        }
    }
}
