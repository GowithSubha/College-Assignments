public class Q24 extends Thread {
    Q24(String threadname, ThreadGroup tg) {
        super(tg, threadname);
        // start();
    }

    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.out.println("Exception encounterted");
            }
        }
        System.out.println(Thread.currentThread().getName() +
                " finished executing");
    }

    public static void main(String arg[]) {
        // creating a ThreadGroup
        ThreadGroup g1 = new ThreadGroup("Parent thread");
        // creating a child ThreadGroup for parent ThreadGroup
        ThreadGroup g2 = new ThreadGroup(g1, "child thread");

        // creating a thread
        Q24 t1 = new Q24("Thread-1", g1);
        t1.start();
        // creating another thread
        Q24 t2 = new Q24("Thread-2", g1);
        t2.start();

        try {
            t1.join();
            t2.join();

            // destroying child thread
            g2.destroy();
            System.out.println(g2.getName() + " destroyed");

            // destroying parent thread
            g1.destroy();
            System.out.println(g1.getName() + " destroyed");
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // now we try to access threads
        try {
            t1.start();
            t2.start();
        } catch (IllegalThreadStateException ex) {
            System.out.println("IllegalThreadStateException: Threads not found!");
        }
    }
}
