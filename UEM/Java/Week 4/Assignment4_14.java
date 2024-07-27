// Create a base class called “vehicle” that stores number of wheels and speed. Create the following derived classes – “car” that inherits “vehicle” and also stores number of passengers. “truck” that inherits “vehicle” and also stores the load limit. Write a main function to create objects of these two derived classes and display all the information about “car” and “truck”. Also compare the sp

class Vehicle {
    protected int numWheels;
    protected int speed;
    public Vehicle(int numWheels, int speed) {
        this.numWheels = numWheels;
        this.speed = speed;
    }
}
class Car extends Vehicle {
    private int numPassengers;
    public Car(int numWheels, int speed, int numPassengers) {
        super(numWheels, speed);
        this.numPassengers = numPassengers;
    }
    public void display() {
        System.out.println("Car Information:");
        System.out.println("Number of Wheels: " + numWheels);
        System.out.println("Speed: " + speed + " mph");
        System.out.println("Number of Passengers: " + numPassengers);
    }
}
class Truck extends Vehicle {
    private int loadLimit;
    public Truck(int numWheels, int speed, int loadLimit) {
        super(numWheels, speed);
        this.loadLimit = loadLimit;
    }
    public void display() {
        System.out.println("Truck Information:");
        System.out.println("Number of Wheels: " + numWheels);
        System.out.println("Speed: " + speed + " mph");
        System.out.println("Load Limit: " + loadLimit + " tons");
    }
}
public class Assignment4_14 {
    public static void main(String[] args) {
        Car car = new Car(4, 100, 5);
        Truck truck = new Truck(6, 80, 10);
        car.display();
        truck.display();
        if (car.speed > truck.speed) {
            System.out.println("Car is faster than Truck.");
        } else if (car.speed < truck.speed) {
            System.out.println("Truck is faster than Car.");
        } else {
            System.out.println("Car and Truck have the same speed.");
        }
    }
}
