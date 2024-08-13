/*
Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone from it. 
The class ThreeDObject has methods wholeSurfaceArea () and volume(). 
Override these two methods in each of the derived classes to calculate the volume and whole 
surface area of each type of three-dimensional objects.The dimensions of the objects are to be 
taken from the users and passed through the respective constructors of each derived class.
Write a main method to test these classes.
 */
import java.util.Scanner;

class ThreeDObject{
    double wholeSurfaceArea(){
        return 0.0;
    }
    double volume(){
        return 0.0;
    }
}

class Box extends ThreeDObject{
    double l , w , h;
    Box(double l , double w , double h){
        this.l =l ;
        this.w = w;
        this.h = h;
    }
    public double wholeSurfaceArea(){
        return 2*(l*w + w*h + h*l);
    }
    public double volume(){
        return l*w*h;
    }
}

class Cube extends ThreeDObject{
    double a;
    Cube(double a){
        this.a = a;
    }
    public double wholeSurfaceArea(){
        return 6*(a*a);
    }
    public double volume(){
        return a*a*a;
    }
}

class Cylinder extends ThreeDObject{
    double r , h;
    Cylinder(double r, double h){
        this.r = r ;
        this.h = h;
    }
    public double wholeSurfaceArea(){
        return 2* Math.PI * r * (r +h);
    }
    public double volume(){
        return Math.PI * r * r * h;
    }
}

class Cone extends ThreeDObject{
    double r, h;
    Cone(double r, double h){
        this.r = r ;
        this.h = h;
    }
    public double wholeSurfaceArea(){
        double root = Math.sqrt(h*h + r*r);
        return Math.PI * r * (r + root);
    }
    public double volume(){
        return Math.PI * r * r * (h/3);
    }
}

public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimensions of Box(l, w, h): ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        Box box = new Box(l, w, h);
        System.out.println("Box Whole Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        System.out.println("Enter the dimensions of Cube(side) : ");
        double a = sc.nextDouble();
        Cube cube = new Cube(a);
        System.out.println("Cube Whole Surface Area : " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume : " + cube.volume());

        System.out.println("Enter the dimensions of Cylinder(r, h) : ");
        double r_cy = sc.nextDouble();
        double h_cy = sc.nextDouble();
        Cylinder cylinder = new Cylinder(r_cy, h_cy);
        System.out.println("Cylinder Whole Surface Area : " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume : " + cylinder.volume());

        System.out.println("Enter the dimensions of Cone(r, h) : ");
        double r_cone = sc.nextDouble();
        double h_cone = sc.nextDouble();
        Cone cone = new Cone(r_cone, h_cone);
        System.out.println("Cone Whole Surface Area : "+ cone.wholeSurfaceArea());
        System.out.println("Cone Volume : "+ cone.volume());

        sc.close();
    }
}
