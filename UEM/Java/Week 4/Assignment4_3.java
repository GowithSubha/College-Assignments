class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
public class Assignment4_3 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.makeSound(); 
        dog.makeSound(); 
        Animal animal2 = new Dog();
        animal2.makeSound(); 
    }
}
