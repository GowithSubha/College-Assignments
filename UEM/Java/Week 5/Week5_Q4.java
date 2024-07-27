// Write a program to define a class having one 3-digit number, num as data member. Initialize and display reverse of that number. 
import java.util.Scanner;
public class Week5_Q4  {
  int num;
  Week5_Q4 (int num){
    this.num = num;
  }
  int reverse(){
    int rev = 0;
    while(this.num>0){
      rev = rev*10 + this.num%10;
      this.num = this.num/10;
    }
    return rev;
  }
  public static void main(String[] args) {

    System.out.print("Enter a 3 digit number: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    Week5_Q4  obj = new Week5_Q4  (num);
    System.out.println("Reverse of " + num + " is: "+obj.reverse());
  }
}
