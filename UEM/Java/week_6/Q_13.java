/*
Write a program to implement the Multiple Inheritance (Bank Interface, Customer & Account 
    classes).
 */
import java.util.Scanner;

interface Bank {
    void show();
}

class Customer {
    private String customerName;
    private String customerId;

    Customer(String name, String id) {
        this.customerName = name;
        this.customerId = id;
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
    }
}
class Account extends Customer implements Bank {
    private String accountNo;
    private double accountBalance;

    Account(String name, String id, String accNo, double balance) {
        super(name, id);
        this.accountNo = accNo;
        this.accountBalance = balance;
    }

    @Override
    public void show() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Balance: $" + accountBalance);
    }


    void inputAccountDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        accountNo = scanner.nextLine();
        System.out.print("Enter account balance: ");
        accountBalance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        scanner.close();
    }
}

public class Q_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter customer ID: ");
        String id = sc.nextLine();
        Account account1 = new Account(name, id, "", 0.0);
        account1.inputAccountDetails();
        account1.display();
        account1.show();

        System.out.print("Enter another customer name: ");
        name = sc.nextLine();
        System.out.print("Enter another customer ID: ");
        id = sc.nextLine();
        Account account2 = new Account(name, id, "", 0.0);
        account2.inputAccountDetails();
        account2.display();
        account2.show();

        sc.close();
    }
}

