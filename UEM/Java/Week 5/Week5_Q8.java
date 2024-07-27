// Write a program to define a class Item containing code and price. Accept this
// data for five objects using array of objects. Display code, price in tabular
// form and also, display total price of all items.
import java.util.Scanner;

class Item {
    String code;
    double price;

    public Item(String code, double price) {
        this.code = code;
        this.price = price;
    }
}

public class Week5_Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Item " + (i + 1) + ":");
            System.out.print("Enter code: ");
            String code = sc.next();
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            items[i] = new Item(code, price);
        }
        System.out.println("\nCode\tPrice(Rupees)");
        System.out.println("---------------------");
        double totalPrice = 0;
        for (Item item : items) {
            System.out.println(item.code + "\t\t" + item.price);
            totalPrice += item.price;
        }
        System.out.println("---------------------");
        System.out.println("Total\t" + totalPrice);
        sc.close();
    }
}
