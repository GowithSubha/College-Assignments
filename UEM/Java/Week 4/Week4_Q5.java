// <!-- Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and volume ( ). Override these two methods in each of the derived classes to calculate the volume and whole surface area of each type of three-dimensional objects. The dimensions of the objects are to be taken from the users and passed through the respective constructors of each derived class. Write a main method to test these classes. -->

import java.util.Scanner;
class ThreeDObject {
    public double wholeSurfaceArea() {
        return 0.0;
    }
    public double volume() {
        return 0.0;
    }
}
class Box extends ThreeDObject {
    private double length, width, height;
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double wholeSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }
    public double volume() {
        return length * width * height;
    }
}
class Cube extends ThreeDObject {
    private double side;
    public Cube(double side) {
        this.side = side;
    }
    public double wholeSurfaceArea() {
        return 6 * side * side;
    }
    public double volume() {
        return side * side * side;
    }
}
class Cylinder extends ThreeDObject {
    private double radius, height;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
class Cone extends ThreeDObject {
    private double radius, height;
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double wholeSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }
    public double volume() {
        return (Math.PI * radius * radius * height) / 3;
    }
}
public class Week4_Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the dimensions for the Box (length, width, height):");
            double boxLength = scanner.nextDouble();
            double boxWidth = scanner.nextDouble();
            double boxHeight = scanner.nextDouble();
           
            Box box = new Box(boxLength, boxWidth, boxHeight);
            System.out.println("Box Volume: " + box.volume());
            System.out.println("Box Whole Surface Area: " + box.wholeSurfaceArea());

            System.out.println("Enter the side length for the Cube:");
            double cubeSide = scanner.nextDouble();
            Cube cube = new Cube(cubeSide);
            System.out.println("Cube Volume: " + cube.volume());
            System.out.println("Cube Whole Surface Area: " + cube.wholeSurfaceArea());

            System.out.println("Enter the dimensions for the Cylinder (radius, height):");
            double cylinderRadius = scanner.nextDouble();
            double cylinderHeight = scanner.nextDouble();
            Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
            System.out.println("Cylinder Volume: " + cylinder.volume());
            System.out.println("Cylinder Whole Surface Area: " + cylinder.wholeSurfaceArea());

            System.out.println("Enter the dimensions for the Cone (radius, height):");
            double coneRadius = scanner.nextDouble();
            double coneHeight = scanner.nextDouble();
            Cone cone = new Cone(coneRadius, coneHeight);
            System.out.println("Cone Volume: " + cone.volume());
            System.out.println("Cone Whole Surface Area: " + cone.wholeSurfaceArea());
            scanner.close();
    }
}
