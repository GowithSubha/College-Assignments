//13. Design a class named Account that contains: 
// I. A private int data field named id for the account (default 0). 
// II. A private double data field named balance for the account (default 0). 
// III. A private double data field named annualInterestRate that stores the cur-rent interest rate (default 0). Assume all accounts have the same interest rate. 
// IV. A private Date data field named dateCreated that stores the date when the account was created. 
// V. A no-arg constructor that creates a default account. 
// VI. A constructor that creates an account with the specified id and initial balance. 
// VII. The accessor and mutator methods for id,balance, and annualInterestRate. 
// VIII. The accessor method for dateCreated. 
// IX. A method named getMonthlyInterestRate() that returns the monthly interest rate. 
// X. A method named getMonthlyInterest() that returns the monthly interest. 
// XI. A method named withdraw that withdraws a specified amount from the account. 
// XII. A method named deposit that deposits a specified amount to the account.
import java.util.Date;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

public class Week5_Q13 {
    public static void main(String[] args) {
        Account ac = new Account(25300013, 3000000);
        ac.setAnnualInterestRate(7.5);
        ac.withdraw(250000);
        ac.deposit(30000);
        System.out.println("Balance: " + ac.getBalance());
        System.out.println("Monthly Interest: " + ac.getMonthlyInterest());
        System.out.println("Date Created: " + ac.getDateCreated());
    }
}
