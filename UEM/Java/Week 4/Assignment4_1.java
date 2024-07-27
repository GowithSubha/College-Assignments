// Write a Java program to implement the concept of inheritance
class Animal {
    String name;
    public void eat() {
    System.out.println("I can eat");
    }
   }
   class Dog extends Animal {
    public void display() {
    System.out.println("My name is " + name);
    }
   }
   class Assignment4_1 {
    public static void main(String[] args) {
   Dog roadesian = new Dog();
    roadesian.name = "Harry";
    roadesian.display();
    roadesian.eat();
    }
   }
