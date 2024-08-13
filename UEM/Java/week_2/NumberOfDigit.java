import java.util.Scanner;
public class NumberOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int temp=num;
        while (temp>0) {
            temp=temp/10;
            count++;
        }
        System.out.println("Number of digit in "+num+" = "+count);
        sc.close();
    }
}
//output
//Enter the number: 
//125893476
//Number of digit in 125893476 = 9
