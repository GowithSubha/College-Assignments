class Thread1 implements Runnable {
    public void run() {

        System.out.println("Thread 1");
    }
}

class Thread2 implements Runnable {
    public void run() {

        System.out.println("Thread 2");
    }
}

class Thread3 implements Runnable {
    public void run() {
        System.out.println("Thread 3");
    }
}

class Thread4 implements Runnable {
    public void run() {
        System.out.println("Thread 4");
    }
}

class Q1 {
    public static void main(String[] args) {
        System.out.println("Main Thread Starts : ");

        Thread1 one = new Thread1();
        Thread t1 = new Thread(one);
        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);

        Thread2 two = new Thread2();
        Thread t2 = new Thread(two);
        t2.start();
        t2.setPriority(Thread.MIN_PRIORITY);

        Thread3 three = new Thread3();
        Thread t3 = new Thread(three);
        t3.start();
        t3.setPriority(Thread.NORM_PRIORITY + 5);

        Thread4 four = new Thread4();
        Thread t4 = new Thread(four);
        t4.start();
        t4.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Main Thread Ends...");

        System.out.println("Priority has been set to thread 1 : " + t1.getPriority());
        System.out.println("Priority has been set to thread 2 : " + t2.getPriority());
        System.out.println("Priority has been set to thread 3 : " + t3.getPriority());
        System.out.println("Priority has been set to thread 4 : " + t4.getPriority());

    }
}
