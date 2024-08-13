public class Q15 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "MyThread 1");
        Thread thread2 = new Thread(new MyRunnable(), "MyThread 2");
        Thread thread3 = new Thread(new MyRunnable(), "MyThread 3");
        Thread thread4 = new Thread(new MyRunnable(), "MyThread 4");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread3.setPriority(Thread.NORM_PRIORITY);
        thread4.setPriority(Thread.NORM_PRIORITY + 2);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            Thread currentThread = Thread.currentThread();
            System.out
                    .println("Thread Name : " + currentThread.getName() + " Priority: " + currentThread.getPriority());
        }
    }
}
