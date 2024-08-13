public class Q36 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();

        mt.start();

        mt.run("Hi, I'm overloaded.");

        String name = mt.getName();
        int priority = mt.getPriority();

        mt.run(name, priority);
    }

    static class MyThread extends Thread {
        public void run() {
            System.out.println("\nI am a run() method of Thread Class.\nRunning from run() method.\n\n");
        }

        public void run(String message) {
            System.out.println(message + "\nfirst : run() method is overloaded in the subclass.\n\n");
        }

        public void run(String name, int priority) {
            System.out.println("Thread Name : " + name + ", Thread Priority : " + priority
                    + "\nsecond : run() method is overloaded in the subclass.\n\n");
        }
    }
}
