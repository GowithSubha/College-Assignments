
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner pl=new Scanner(System.in);
        int rev=0;
        System.out.println("Enter the number: ");
        int num=pl.nextInt();
        int temp=num;
        while (num>0) {
            int reminder=num%10;
            rev=(rev*10)+reminder;
            num=num/10;
        }
        if(rev==temp){
            System.out.println("This is a palindrome number");
        }
        else{
            System.out.println("This is not a palindrome number");
        }
        pl.close();
    }
}
//output

//Enter the number: 
//50
//This is not a palindrome number

