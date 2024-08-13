public class Q30 {
    public static void main(String[] args) {
        System.out.println("Race starts...");

        ThreadExecuting t_exe = new ThreadExecuting();
        t_exe.start();

        while (t_exe.isAlive()) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException : Thread not found or destroyed.");
            }
            System.out.println("--- Running ---");
            System.out.println("Finished !");
        }
    }
}

class ThreadExecuting extends Thread {
    public void run() {
        System.out.println("I am a Thread, I am running...");
    }
}