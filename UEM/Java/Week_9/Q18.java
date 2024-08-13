public class Q18 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName() + " is running.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(currentThread.getName() + " has finished.");
        }
    }
}
