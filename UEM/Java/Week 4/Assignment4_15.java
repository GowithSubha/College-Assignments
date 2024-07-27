// Write a Java program to explain“multilevel inheritance.”
// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}
// Child class inheriting from Vehicle
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}
// Grandchild class inheriting from Car
class SportsCar extends Car {
    void accelerate() {
        System.out.println("SportsCar is accelerating...");
    }
}
// Main class
public class Assignment4_15 {
    public static void main(String[] args) {
    SportsCar sportsCar = new SportsCar();

    // SportsCar class can access methods from Vehicle, Car, and its own class
    sportsCar.start(); // Method from Vehicle class
    sportsCar.drive(); // Method from Car class
    sportsCar.accelerate(); // Method from SportsCar class
    sportsCar.stop(); // Method from Vehicle class
    }
}
