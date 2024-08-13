public class Q37 {
    public static void main(String[] args) {
        My_Thread m_t = new My_Thread();
        // m_t.start();
        m_t.display();
    }
}

class My_Thread extends Thread {
    public void display() {
        System.out.println("Hii");
    }
}