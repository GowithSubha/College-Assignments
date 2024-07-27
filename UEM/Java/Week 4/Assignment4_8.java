// Create a base class Building that stores the number of floors of a building, number of rooms and it’s total footage. Create a derived class House that inherits Building and also stores the number of bedrooms and bathrooms. Demonstrate the working of the classes.


import java.util.Scanner;
class Building {
    protected int numberOfFloors;
    protected int numberOfRooms;
    protected double totalFootage;
    public Building(int numberOfFloors, int numberOfRooms, double totalFootage) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfRooms = numberOfRooms;
        this.totalFootage = totalFootage;
    }
}
class House extends Building {
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    public House(int numberOfFloors, int numberOfRooms, double totalFootage, int numberOfBedrooms, int numberOfBathrooms) {
        super(numberOfFloors, numberOfRooms, totalFootage);
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }
    public void displayDetails() {
        System.out.println("House Details:");
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Total Footage: " + totalFootage);
        System.out.println("Number of Bedrooms: " + numberOfBedrooms);
        System.out.println("Number of Bathrooms: " + numberOfBathrooms);
    }
}
public class Assignment4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter House Details:");
        System.out.print("Number of Floors: ");
        int numberOfFloors = scanner.nextInt();
        System.out.print("Number of Rooms: ");
        int numberOfRooms = scanner.nextInt();
        System.out.print("Total Footage: ");
        double totalFootage = scanner.nextDouble();
        System.out.print("Number of Bedrooms: ");
        int numberOfBedrooms = scanner.nextInt();
        System.out.print("Number of Bathrooms: ");
        int numberOfBathrooms = scanner.nextInt();
        House house = new House(numberOfFloors, numberOfRooms, totalFootage, numberOfBedrooms, numberOfBathrooms);
        scanner.close();
        house.displayDetails();
    }
}
