import java.util.Scanner;
public class BuzzNumber {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        number=sc.nextInt();
        if (number%10==7 || number%7==0) {
            System.out.println(number+" is a buzz number");
        }
        else{
            System.out.println(number+" is not a buzz number");
        }
        sc.close();
    }
    
}
//Output
//Enter the number: 
//57
//57 is a buzz number