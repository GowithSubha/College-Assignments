public class Q38 extends Thread {
    private volatile boolean stopRequested = false;

    @Override
    public void run() {
        while (!stopRequested) {
            System.out.println("Thread is running...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Thread stopped.");
    }

    public void requestStop() {
        stopRequested = true;
        interrupt(); // additional,Interrupt the thread if it's sleeping
    }

    public static void main(String[] args) {
        Q38 t = new Q38();
        t.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.requestStop();
    }
}

// public class Q38 extends Thread {
// private volatile boolean stopRequested = false;

// @Override
// public void run() {
// while (!stopRequested) {
// // Thread's work goes here
// System.out.println("Thread is running...");

// try {
// Thread.sleep(1000); // Simulating some work
// } catch (InterruptedException e) {
// Thread.currentThread().interrupt(); // Preserve interrupted status
// }
// }
// System.out.println("Thread stopped.");
// }

// public void requestStop() {
// stopRequested = true;
// }

// public static void main(String[] args) {
// Q38 t = new Q38();
// t.start();

// // Wait for some time before stopping the thread
// try {
// Thread.sleep(5000);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }

// // Request the thread to stop
// t.requestStop();
// }
// }
