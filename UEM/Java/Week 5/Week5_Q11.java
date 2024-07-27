//. Define a class called circle that contains: 
// • Two private instance variables: radius (of type double) and color (of type String), 
// • Initialize the variables radius and color with default value of 1.0 and "red", respectively using default constructor. 
// • Include a second constructor that will use the default value for color and sets the 
// radius to the value passed as parameter. 
// • Two public methods: getRadius() and getArea() for returning the radius and area of 
// the circle 
// • Invoke the above methods and constructors in the main.
import java.math.*;

class Circle {
    private double radius;
    private String color;

    Circle() {
        radius = 5.0;
        color = "red";
    }

    Circle(double r) {
        radius = r;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Week5_Q11 {
    public static void main(String[] args) {
        Circle cir = new Circle(10.5);
        System.out.printf("Radius: %.2f\n" , cir.getRadius());
        System.out.printf("Area: %.3f\n" , cir.getArea());
    }
}
