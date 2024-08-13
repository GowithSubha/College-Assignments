public class Q20 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();

        try {
            mt.start();

            mt.start();
        } catch (IllegalThreadStateException e) {
            System.out.println("Error : " + e + " : " + e.getMessage());
        }
    }
}

class MyThread extends Thread {
    public void run() {
        Thread.currentThread().setName("T1");
        System.out.println("Thread Name : " + Thread.currentThread().getName() + " & it's priority : "
                + Thread.currentThread().getPriority());
    }
}
