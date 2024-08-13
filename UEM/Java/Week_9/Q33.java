public class Q33 {
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnable(), "MyThread");
        myThread.start();

        while (myThread.isAlive()) {
            System.out.println("Thread is alive");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted while waiting");
            }
        }
        System.out.println("Thread is no longer alive");
    }

    static class MyRunnable implements Runnable {
        public void run() {
            try {
                System.out.println("Thread starting...");
                Thread.sleep(3000);
                System.out.println("Thread exiting...");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
