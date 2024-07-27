// In the earlier program, create a second derived class Office that inherits Building and stores the number of telephones and tables. Now demonstrate the working of all three classes.

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
class Office extends Building {
    private int numberOfTelephones;
    private int numberOfTables;
    public Office(int numberOfFloors, int numberOfRooms, double totalFootage, int numberOfTelephones, int numberOfTables) {
        super(numberOfFloors, numberOfRooms, totalFootage);
        this.numberOfTelephones = numberOfTelephones;
        this.numberOfTables = numberOfTables;
    }
    public void displayDetails() {
        System.out.println("Office Details:");
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Total Footage: " + totalFootage);
        System.out.println("Number of Telephones: " + numberOfTelephones);
        System.out.println("Number of Tables: " + numberOfTables);
    }
}
public class Assignment4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter House Details:");
        System.out.print("Number of Floors: ");
        int houseFloors = scanner.nextInt();
        System.out.print("Number of Rooms: ");
        int houseRooms = scanner.nextInt();
        System.out.print("Total Footage: ");
        double houseFootage = scanner.nextDouble();
        System.out.print("Number of Bedrooms: ");
        int houseBedrooms = scanner.nextInt();
        System.out.print("Number of Bathrooms: ");
        int houseBathrooms = scanner.nextInt();
        House house = new House(houseFloors, houseRooms, houseFootage, houseBedrooms,                     
        houseBathrooms);
        System.out.println("\nEnter Office Details:");
        System.out.print("Number of Floors: ");
        int officeFloors = scanner.nextInt();
        System.out.print("Number of Rooms: ");
        int officeRooms = scanner.nextInt();
        System.out.print("Total Footage: ");
        double officeFootage = scanner.nextDouble();
        System.out.print("Number of Telephones: ");
        int officeTelephones = scanner.nextInt();
        System.out.print("Number of Tables: ");
        int officeTables = scanner.nextInt();
        Office office = new Office(officeFloors, officeRooms, officeFootage, officeTelephones, officeTables);
        scanner.close();
        System.out.println("\nHouse Details:");
        house.displayDetails();
        System.out.println("\nOffice Details:");
        office.displayDetails();
    }
}
