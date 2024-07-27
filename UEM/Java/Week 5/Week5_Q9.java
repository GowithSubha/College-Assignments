// Write a program to define a class Tender containing data members cost and
// company name. Accept data for five objects and display company name for which
// cost is minimum.
import java.util.Scanner;

class Tender {
    String companyName;
    double cost;

    public Tender(String companyName, double cost) {
        this.companyName = companyName;
        this.cost = cost;
    }
}

public class Week5_Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tender[] t = new Tender[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Tender " + (i + 1) + ":");
            System.out.print("Enter Company Name: ");
            String companyName = sc.next();
            System.out.print("Enter Cost: ");
            double cost = sc.nextDouble();
            t[i] = new Tender(companyName, cost);
        }
        int minCostCom = 0;
        for (int i = 1; i < 5; i++) {
            if (t[minCostCom].cost > t[i].cost)
                minCostCom = i;
        }
        System.out.println("Company with Minimum Cost: " + t[minCostCom].companyName);
        sc.close();
    }
}
