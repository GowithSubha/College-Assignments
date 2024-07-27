//Write a test program that prompts the user to enter the investment amount (e.g., 1000) and the interest rate (e.g., 9%), and print a table that displays future value for the years from 1 to 30, as shown below:
// The amount invested: 1000		Annual interest rate: 9% 	Years Future Value 
// 1 1093.8 	2 1196.41 		... 	29 13467.25 	30 14730.57

import java.util.Scanner;

public class Week5_Q14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount invested: ");
		double amount = input.nextDouble();
		
		System.out.print("Enter the annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		
		System.out.println("| Years | ----- | Future Value |");
		for (int i = 1; i <= 30; i++) {
			double futureValue = amount * Math.pow(1 + annualInterestRate / 100, i);
			System.out.printf("  %d\t\t  %.3f\n" ,i, futureValue);
		}
	}
}