package week_8;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Q_1 {
    static int fact(int num) {
        int fact = 1;
        for (int i = num; i > 1; i--)
            fact *= i;
        return fact;
    }
    public static void main(String[] args) throws IOException{
        System.out.print("Enter a Number(Input through BufferReader): ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num2 = Integer.parseInt(br.readLine());
        int fact2 = fact(num2);

        System.out.print("Enter a Number(Input through Scanner class): ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int fact1 = fact(num);
        
        System.out.println("Factorial of " + num + " = " + fact1);
        System.out.println("Factorial of " + num2 + " = " + fact2);
    }
}

//Output:
//Enter a Number(Input through BufferReader): 5
//Enter a Number(Input through Scanner class): 4
//Factorial of 4 = 24
//Factorial of 5 = 120
