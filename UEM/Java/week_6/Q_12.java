import java.util.Scanner;

class Vehicle {
    int ID;
    String Name;
    String LicenseNumber;

    public Vehicle(int ID, String Name, String LicenseNumber) {
        this.ID = ID;
        this.Name = Name;
        this.LicenseNumber = LicenseNumber;
    }
}
class TwoWheeler extends Vehicle {
    String SteeringHandle;

    public TwoWheeler(int ID, String Name, String LicenseNumber, String SteeringHandle) {
        super(ID, Name, LicenseNumber);
        this.SteeringHandle = SteeringHandle;
    }
}
class FourWheeler extends Vehicle {
    String SteeringWheel;

    public FourWheeler(int ID, String Name, String LicenseNumber, String SteeringWheel) {
        super(ID, Name, LicenseNumber);
        this.SteeringWheel = SteeringWheel;
    }
}
public class Q_12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two-Wheeler details:");
        System.out.print("ID: ");
        int bikeID = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String bikeName = sc.nextLine();
        System.out.print("License Number: ");
        String bikeLicenseNumber = sc.nextLine();
        System.out.print("Steering Handle: ");
        String bikeSteeringHandle = sc.nextLine();
        TwoWheeler bike = new TwoWheeler(bikeID, bikeName, bikeLicenseNumber, bikeSteeringHandle);


        System.out.println("\nEnter Four-Wheeler details:");
        System.out.print("ID: ");
        int carID = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String carName = sc.nextLine();
        System.out.print("License Number: ");
        String carLicenseNumber = sc.nextLine();
        System.out.print("Steering Wheel: ");
        String carSteeringWheel = sc.nextLine();
        FourWheeler car = new FourWheeler(carID, carName, carLicenseNumber, carSteeringWheel);


        System.out.println("\nTwo-Wheeler Details:");
        System.out.println("ID: " + bike.ID);
        System.out.println("Name: " + bike.Name);
        System.out.println("License Number: " + bike.LicenseNumber);
        System.out.println("Steering Handle: " + bike.SteeringHandle);

        System.out.println("\nFour-Wheeler Details:");
        System.out.println("ID: " + car.ID);
        System.out.println("Name: " + car.Name);
        System.out.println("License Number: " + car.LicenseNumber);
        System.out.println("Steering Wheel: " + car.SteeringWheel);
    }
}
