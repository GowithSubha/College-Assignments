public class Q23 {
    public static void main(String[] args) {
        MyThreadClass mtc = new MyThreadClass();
        mtc.start();
    }
}

class MyThreadClass extends Thread {
    public void run() {
        System.out.println("This program is for demonstrating the use of setName() on Thread : ");
        System.out.println(
                "Before changing name of the thread : \n -> Thread Name : " + Thread.currentThread().getName());
        Thread.currentThread().setName("T1-Thread1");
        System.out
                .println("After changing name of the thread : \n -> Thread Name : " + Thread.currentThread().getName());
    }
}
