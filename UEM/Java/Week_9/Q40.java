public class Q40 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the thread has stopped
        if (!thread.isAlive()) {
            System.out.println("Thread has stopped.");
        } else {
            System.out.println("Thread is still running.");
        }
    }
}
