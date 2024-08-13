import java.util.Scanner;

public class AccountManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating two accounts
        Account account1 = new Account("John", 1000);
        Account account2 = new Account("Alice", 700);

        // Depositing money to both accounts
        account1.deposit(500);
        account2.deposit(800);

        // Trying to withdraw more money from account2 than balance
        try {
            account2.withdraw(1000);
        } catch (LessBalanceException e) {
            System.out.println(e.getMessage());
        }

        // Displaying account details
        System.out.println("Account details:");
        System.out.println(account1);
        System.out.println(account2);
    }
}

class Account {
    private String accountHolder;
    private double balance;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " Rs deposited successfully.");
    }

    public void withdraw(double amount) throws LessBalanceException {
        if (balance - amount < 500) {
            throw new LessBalanceException("Withdraw amount (" + amount + " Rs) is not valid.");
        }
        balance -= amount;
        System.out.println(amount + " Rs withdrawn successfully.");
    }

    @Override
    public String toString() {
        return "Account Holder: " + accountHolder + ", Balance: " + balance + " Rs";
    }
}

class LessBalanceException extends Exception {
    public LessBalanceException(String message) {
        super(message);
    }
}
