/*
Create an abstract class Accounts with the following details:
Data Members:
(a) Balance (b) accountNumber (c) accountHoldersName (d) address
Methods:
(a) withdrawl()- abstract
(b) deposit()- abstract 
(c) display() to show the balance of the account number
Create a subclass of this class SavingsAccount and add the following details:
Data Members:
(a) rateOfInterest
Methods:
(a) calculateAount()
 */

import java.util.Scanner;

abstract class Accounts {
    protected double Balance;
    protected int accountNumber;
    protected String accountHoldersName;
    protected String address;

    Accounts(double Balance, int accountNumber, String accountHoldersName, String address){
        this.Balance = Balance;
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
    }
    abstract void withdrawl(double amount);
    abstract void deposit(double amount);

    public void display(){
        System.out.println("Account Number :" + accountNumber);
        System.out.println("Balance : " + Balance);
    }   
 }

 class SavingsAccount extends Accounts{
    private double rateOfInterest;

    SavingsAccount(double Balance, int accountNumber, String accountHoldersName, String address, double rateOfInterest){
        super(Balance, accountNumber, accountHoldersName, address);
        this.rateOfInterest = rateOfInterest;
    }
    void calculateAmount(int years){
        double interest = Balance * rateOfInterest * years;
        Balance += interest;
        System.out.println("Interest earned over " + years + " years: " + interest);
        System.out.println("New balance after interest: " + Balance);
    }

    @Override
    void withdrawl(double amount) {
        if(amount > Balance){
            System.out.println("Insufficent balance...");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Withdarwal successful..!! Remaining Balance: " + Balance);
        }
    }
    @Override
    void deposit(double amount) {
        Balance += amount;
        System.out.println("Deposit successful. Balance : " + Balance);
    }
    @Override
    public void display() {
        System.out.println("Account Holders name : " + accountHoldersName);
        System.out.println("Interest Rate : " + rateOfInterest);
        super.display();
    }
 }
 public class Q_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine(); // Consume newline
    
        System.out.println("Enter Account Holders Name :");
        String accountHoldersName = sc.nextLine();
    
        System.out.println("Enter Account Balance : ");
        double balance = sc.nextDouble();
        sc.nextLine(); // Consume newline
    
        System.out.println("Enter rate of interest : ");
        double rateOfInterest = sc.nextDouble();
        sc.nextLine(); // Consume newline
    
        System.out.println("Enter Account holders address :  ");
        String address = sc.nextLine();

        SavingsAccount sa = new SavingsAccount(balance, accountNumber, accountHoldersName, address, rateOfInterest);

        sa.deposit(1000);
        sa.withdrawl(800);
        System.out.println("==========================================");
        sa.display();
        sa.calculateAmount(1);
    }
 }