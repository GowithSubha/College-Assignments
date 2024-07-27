// Write a Java program to show method hiding.
class Parent {
    public static void display() {
        System.out.println("Static method in Parent");
    }
}
class Child extends Parent {
    public static void display() {
        System.out.println("Static method in Child");
    }
}
public class Assignment4_4 {
    public static void main(String[] args) {
        Parent.display(); 
        Child.display(); 
        Child child = new Child();
        child.display(); 
        Parent parent = new Child();
        parent.display(); 
    }
}
