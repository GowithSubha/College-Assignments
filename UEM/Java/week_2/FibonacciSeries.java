import java.util.Scanner;
public class FibonacciSeri {
    public static void main(String[] args) {
        int num;
        int n1=0,n2=1,n3;
        Scanner fb=new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=fb.nextInt();
        System.out.println("The fibonacci Series:-");
        System.out.println(n1+"\n"+n2);
        for(int i=2;i<num;i++){ //loop start from 2 bcz 0 and 1 already printed
            n3=n1+n2;
            System.err.println(n3);
            n1=n2;
            n2=n3;
        }
        fb.close();

    }
}
//output
//Enter the number: 
//7
//The fibonacci Series:-
//0
//1
//1
//2
//3
//5
//8
