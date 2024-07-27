// Create a base class Distance which stores the distance between two locations in miles and a method travelTime(). The method prints the time taken to cover the distance when the speed is 60 miles per hour. Now in a derived class DistanceMKS, override travelTime() so that it prints the time assuming the distance is in kilometers and the speed is 100 km per second. Demonstrate the working of the classes.
import java.util.Scanner;
class Distance {
    protected double distance;
    public Distance(double distance) {
        this.distance = distance;
    }
    public void travelTime() {
        double time = distance / 60.0;
        System.out.printf("Time taken to cover the distance at 60 mph: %.3f hours\n", time);
    }
}
class DistanceMKS extends Distance {
    public DistanceMKS(double distance) {
        super(distance);
    }
    public void travelTime() {
        double time = distance / 100.0;
        System.out.println("Time taken to cover the distance at 100 km/s: " + time + " seconds");
    }
}
public class Assignment4_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in miles: ");
        double distanceMiles = scanner.nextDouble();
        Distance distance = new Distance(distanceMiles);
        distance.travelTime();
        System.out.print("Enter distance in kilometers: ");
        double distanceKilometers = scanner.nextDouble();
        DistanceMKS distanceMKS = new DistanceMKS(distanceKilometers);
        distanceMKS.travelTime();
        scanner.close();
    }
}
