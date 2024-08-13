public class Q29 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " : Priority : " + Thread.currentThread().getPriority());

        ClassThread ct = new ClassThread();
        ct.setPriority(9);
        ct.start();

    }
}

class ClassThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : Priority : " + Thread.currentThread().getPriority());
    }
}