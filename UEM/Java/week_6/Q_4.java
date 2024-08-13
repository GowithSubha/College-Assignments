/*
  Write a program to create a class named Vehicle having protected instance variables 
regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a 
vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having 
individual private instance variables routeNumber in Bus and manufacturerName in Car 
and both of them having showData ( ) method showing all details of Bus and Car 
respectively with content of the super class’s showData ( ) method
 */
import java.util.Scanner;
class Vehicle{
    protected String regnNumber, color, ownerName;
    protected int speed;

    Vehicle(String regnNumber, String color, String ownerName, int speed){
        this.regnNumber = regnNumber;
        this.color = color;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    public void showData(){
        System.out.println("=======================================");
        System.out.println("This is a vehicle class :::: ");
        System.out.println("Registration Number: " +  regnNumber);
        System.out.println("Speed : " + speed);
        System.out.println("Color : " + color);
        System.out.println("Owner Name : " + ownerName);
    }
}
class Bus extends Vehicle{
    private String routeNumber;

    Bus (String regnNumber, String color, String ownerName, int speed, String routeNumber){
        super(regnNumber, color, ownerName, speed);
        this.routeNumber = routeNumber;
    }
    public void showData(){
        super.showData();
        System.out.println("Route Number : " + routeNumber);
    }
}
class car extends Vehicle{
    private String manufacturerName;
    
    car(String regnNumber, String color, String ownerName, int speed, String manufacturerName){
        super(regnNumber, color, ownerName, speed);
        this.manufacturerName = manufacturerName;
    }
    
    public void showData(){
        super.showData();
        System.out.println("Manufacturer Name : " + manufacturerName);
    }
}

public class Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Bus Details :");
        System.out.println("Registration Number: ");
        String regnNumber_B = sc.nextLine();
        System.out.println("Speed : " );
        int speed_B = sc.nextInt();
        System.out.println("Color : " );
        String color_B = sc.nextLine();
        System.out.println("Owner Name : " );
        String ownerName_B = sc.nextLine();
        System.out.println("Route Number : " );
        String routeNumber_B = sc.nextLine();
        Bus b = new Bus(regnNumber_B, color_B, ownerName_B, speed_B, routeNumber_B);
        System.out.println("=======================================");

        System.out.println("Enter Car Details :");
        System.out.println("Registration Number: ");
        String regnNumber_c = sc.nextLine();
        System.out.println("Speed : " );
        int speed_c = sc.nextInt();
        System.out.println("Color : " );
        String color_c = sc.nextLine();
        System.out.println("Owner Name : " );
        String ownerName_c = sc.nextLine();
        System.out.println("Manufacturer Name : ");
        String manufacturerName_c = sc.nextLine();
        car c = new car(regnNumber_c, color_c, ownerName_c, speed_c, manufacturerName_c);
        System.out.println("=======================================");
        System.out.println("Car Details: ");
        c.showData();
        System.out.println("=======================================");
        System.out.println("Bus Details: ");
        b.showData();

        sc.close();
    }
}
