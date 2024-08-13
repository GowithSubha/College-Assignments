public class Q8 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        Thread thread3 = new Thread(new MyThread());

        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("Done");
    }
}

class MyClass {
    public static synchronized void synchronizedMethod() {

        System.out.println(Thread.currentThread().getName() + " is inside synchronized method.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        MyClass.synchronizedMethod();
    }
}
