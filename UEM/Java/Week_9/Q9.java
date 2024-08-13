public class Q9 {
    public static void main(String[] args) {
        // Create a shared object
        SharedObject sharedObject = new SharedObject();

        // Create and start multiple threads accessing the shared object
        Thread thread1 = new Thread(new MyRunnable(sharedObject));
        Thread thread2 = new Thread(new MyRunnable(sharedObject));
        Thread thread3 = new Thread(new MyRunnable(sharedObject));
        Thread thread4 = new Thread(new MyRunnable(sharedObject));
        Thread thread5 = new Thread(new MyRunnable(sharedObject));
        Thread thread6 = new Thread(new MyRunnable(sharedObject));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}

// SharedObject class representing the shared object
class SharedObject {
    public void synchronizedMethod() {
        synchronized (this) {
            // Synchronized block ensures only one thread can execute this block at a time
            System.out.println(Thread.currentThread().getName() + " is inside synchronized method.");
            try {
                Thread.sleep(2000); // Simulating some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// MyRunnable class representing the runnable task
class MyRunnable implements Runnable {
    private final SharedObject sharedObject;

    public MyRunnable(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    @Override
    public void run() {
        // Access the synchronized method of the shared object
        sharedObject.synchronizedMethod();
    }
}