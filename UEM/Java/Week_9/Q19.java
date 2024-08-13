public class Q19 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("I am MyThread Class, extending Thread class.");
    }
}