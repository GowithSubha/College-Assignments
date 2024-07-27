import java.util.*;
import copyright.copyright;
import java.util.Scanner;
public class DivisiblebyFive{
    public static void main(String[] args) {
        copyright.main(args);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println(n+" is divisible by 5");
        }
        else{
            System.out.println(n+" is not divisible by 5");
        }
        sc.close();
    }
}