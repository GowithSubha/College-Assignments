import java.util.*;
//find all roots of an quadratic equation
public class QadraticEquationRoot {
    public static void main(String[] args) {
        Scanner qu=new Scanner(System.in);
        System.out.println("Enter the quadratic equation(ax^2+bx+c): ");
        System.out.println("Enter the value of a:");
        double a=qu.nextDouble();
        System.out.println("Enter the value of b:");
        double b=qu.nextDouble();
        System.out.println("Enter the value of c:");
        double c=qu.nextDouble();

        double discriminent=b*b+4*a*c;

        if(discriminent>0){
            double root1=(-b+Math.sqrt(discriminent))/(2*a);
            double root2=(-b-Math.sqrt(discriminent))/(2*a);
            System.out.println("Roots are real and different");
            System.out.println("Root 1: "+root1);
            System.out.println("Root 2: "+root2);
        }
        else if(discriminent==0){
            double root=-b/(2*a);
            System.out.println("Roots are real and same");
            System.out.println("Root: "+root);
        }
        else{
            double realPart= b/(2*a);
            double imaginaryPart=Math.sqrt(-discriminent)/(2*a);
            System.out.println("Roots are complex and different");
            System.err.println("Root 1:"+realPart+"+"+imaginaryPart+"i");
            System.err.println("Root 2:"+realPart+"-"+imaginaryPart+"i");
        }
        qu.close();

    }
    
}
//output
//Enter the quadratic equation(ax^2+bx+c): 
//Enter the value of a:
//4
//Enter the value of b:
//6
//Enter the value of c:
//3
//Roots are real and different
//Root 1: 0.39564392373895996
//Root 2: -1.89564392373896
