/*Create an abstract class MotorVehicle with the following details:
Data Members:
(a) modelName (b)modelNumber (c) modelPrice 
Methods:
(a) display() to show all the details
Create a subclass of this class Carthat inherits the class MotorVehicle and add the following details:
Data Members:
(b) discountRate
Methods:
(a) display() method to display the Car name, model number, price and the discount rate.
(b) discount() method to compute the discount.
 */
import java.util.Scanner;

abstract class MotorVehicle {
    protected String modelName;
    protected String modelNumber;
    protected double modelPrice;

    public MotorVehicle(String modelName, String modelNumber, double modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }

    public abstract void display();
}

class Car extends MotorVehicle {
    private double discountRate;

    public Car(String modelName, String modelNumber, double modelPrice, double discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }

    public void display() {
        System.out.println("Car Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Price: " + modelPrice);
        System.out.println("Discount Rate: " + discountRate);
    }

    public double discount() {
        return modelPrice * (discountRate / 100.0);
    }
}

public class Q_9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Car Name:");
        String modelName = scanner.nextLine();

        System.out.println("Enter Model Number:");
        String modelNumber = scanner.nextLine();

        System.out.println("Enter Model Price:");
        double modelPrice = scanner.nextDouble();

        System.out.println("Enter Discount Rate:");
        double discountRate = scanner.nextDouble();

        Car car = new Car(modelName, modelNumber, modelPrice, discountRate);

        System.out.println("Car Details:");
        car.display();

        System.out.println("Discount Amount: " + car.discount());

        scanner.close();
    }
}
