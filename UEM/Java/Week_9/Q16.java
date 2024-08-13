public class Q16 {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        System.out.println(Thread.currentThread().getName() + " -> Priority : " + mainThread.getPriority());

        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        Thread thread3 = new Thread(new MyRunnable(), "Thread 3");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted.");
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName() + " -> Priority: " + currentThread.getPriority());
    }
}