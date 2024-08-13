/*
Write a program in Java to illustrate the use of interface in Java.
*/
interface Animal {
    void eat();
    void sleep();    
}
class Dog implements Animal{
    public void eat(){
        System.out.println("Dog eats");
    }
    public void sleep(){
        System.out.println("Dog sleeps");
    }
}
class cat implements Animal{
    public void eat(){
        System.out.println("cat eats");
    }
    public void sleep(){
        System.out.println("cat sleeps");
    }  
}

public class Q_2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        cat c = new cat();

        d.eat();
        c.eat();

        d.sleep();
        c.sleep();
    }
}