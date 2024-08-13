class One extends Thread{
    public void run() {
        try {
            for(int count = 0; count <=5; count++){
                System.out.println("For class ONE, count = "+count);
                Thread.sleep(10);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}

class Two extends Thread{
    public void run() {
        try {
            for(int count = 0; count <=5; count++){
                System.out.println("For class TWO, count = "+count);
                Thread.sleep(10);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}

class Three extends Thread{
    public void run() {
        try {
            for(int count = 0; count <=5; count++){
                System.out.println("For class THREE, count = "+count);
                Thread.sleep(10);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}

class Four extends Thread{
    public void run() {
        try {
            for(int count = 0; count <=5; count++){
                System.out.println("For class FOUR, count = "+count);
                Thread.sleep(10);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}


public class Q2 {
    public static void main(String[] args) {
        One o = new One();
        Two t = new Two();
        Three th = new Three();
        Four f = new Four();
        
        o.setPriority(1);
        t.setPriority(3);
        th.setPriority(5);
        f.setPriority(7);

        o.start();
        t.start();
        th.start();
        f.start();
    }
}

