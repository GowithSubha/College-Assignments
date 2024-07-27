// Write a program to create a class named Vehicle having protected instance variables regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having individual private instance variables routeNumber in Bus and manufacturerName in Car and both of them having showData ( ) method showing all details of Bus and Car respectively with content of the super class’s showData ( ) method.

import java.util.Scanner;
class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;
    public Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }
    protected void showData() {
        System.out.println("This is a vehicle class");
    }
}
class Bus extends Vehicle {
    private String routeNumber;
    public Bus(String regnNumber, int speed, String color, String ownerName, String routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }
    protected void showData() {
        super.showData(); 
        System.out.println("Bus Details:");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Route Number: " + routeNumber);
    }
}
class Car extends Vehicle {
    private String manufacturerName;
    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }
    protected void showData() {
        super.showData(); 
        System.out.println("Car Details:");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}
public class Assignment4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Bus Details:");
        System.out.print("Registration Number: ");
        String busRegnNumber = scanner.nextLine();
        System.out.print("Speed: ");
        int busSpeed = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Color: ");
        String busColor = scanner.nextLine();
        System.out.print("Owner Name: ");
        String busOwnerName = scanner.nextLine();
        System.out.print("Route Number: ");
        String busRouteNumber = scanner.nextLine();
        Bus bus = new Bus(busRegnNumber, busSpeed, busColor, busOwnerName, busRouteNumber);
        System.out.println("\nEnter Car Details:");
        System.out.print("Registration Number: ");
        String carRegnNumber = scanner.nextLine();
        System.out.print("Speed: ");
        int carSpeed = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Color: ");
        String carColor = scanner.nextLine();
        System.out.print("Owner Name: ");
        String carOwnerName = scanner.nextLine();
        System.out.print("Manufacturer Name: ");
        String carManufacturerName = scanner.nextLine();
        Car car = new Car(carRegnNumber, carSpeed, carColor, carOwnerName, carManufacturerName);
        scanner.close();
        System.out.println("\nDetails of Bus:");
        bus.showData();
        System.out.println("\nDetails of Car:");
        car.showData();
    }
}
