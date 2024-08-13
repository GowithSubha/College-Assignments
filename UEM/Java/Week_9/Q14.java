public class Q14 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnablePriority(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnablePriority(), "Thread 2");

        thread1.start();
        thread2.start();
    }

    static class MyRunnablePriority implements Runnable {
        @Override
        public void run() {
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName() + " Priority: " + currentThread.getPriority());
        }
    }
}
