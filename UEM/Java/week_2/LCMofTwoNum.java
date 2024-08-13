import java.util.Scanner;
public class LCMofTwoNum {
    public static void main(String[] args) {
        Scanner lc=new Scanner(System.in);
        int lcm=0;
        int hcf=0;
        System.out.println("Enter the 1st num: ");
        int num1=lc.nextInt();
        System.out.println("Enter the 2nd num: ");
        int num2=lc.nextInt();
        for(int i=1;i<=num1||i<num2;i++){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
        }
        lcm=(num1*num2)/hcf;
        System.out.println("The lcm is: "+lcm);
        lc.close();
    }
}
//output
//Enter the 1st num: 
//33
//Enter the 2nd num: 
//99
//The lcm is: 99
