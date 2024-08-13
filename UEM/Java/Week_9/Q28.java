public class Q28 {
    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();

        Thread thread1 = new Thread(new MyRunnable(), "Thread-1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread-2");

        // Get the thread groups of thread1 and thread2
        ThreadGroup group1 = thread1.getThreadGroup();
        ThreadGroup group2 = thread2.getThreadGroup();

        System.out.println(Thread.currentThread().getName() + " :  Thread Group: " + mainGroup.getName());
        System.out.println(thread1.getName() + " : Thread Group: " + group1.getName());
        System.out.println(thread2.getName() + " :  Thread Group: " + group2.getName());

        thread1.start();
        thread2.start();
    }

    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + " - okay !");
        }
    }
}
