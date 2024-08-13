/*
Design an abstract class having two methods. Create Rectangle and Triangle classes by 
inheriting the shape class and override the above methods to suitably implement for 
Rectangle and Triangle class.
*/
import java.util.Scanner;

abstract class shape{
    abstract double area();
    abstract double perimeter();
}

class Rectangle extends shape{
    double l,w;
    Rectangle(double l, double w){
        this.l = l;
        this.w = w;
    }
    @Override
    public double area(){
        return l*w;
    }
    public double perimeter(){
        return 2*(l+w);
    }
}

class Triangle extends shape{
    double b, h, a, c;
    Triangle(double a, double b, double c, double h){
        this.b = b;
        this.h = h;
        this.a = a;
        this.c = c;
    }
    public double area(){
        return (b*h)/2;
    }
    public double perimeter(){
        return a+b+c;
    }
}
public class Q_1 {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the length and width of the Rectangle : ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        Rectangle r =new Rectangle(l, w);
        System.out.println("Area of the Rectangle : " + r.area());
        System.out.println("Perimeter of the Rectangle : " + r.perimeter());


        System.out.println("Enter the three sides and height of the Triangle : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double h = sc.nextDouble();
        Triangle t = new Triangle(a, b, c, h);
        System.out.println("Area of the triangle : " + t.area());
        System.out.println("Perimeter of the triangle : " + t.perimeter());
        
        sc.close();
    }
}