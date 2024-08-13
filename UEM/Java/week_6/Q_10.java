abstract class Asset {
    String descriptor;
    String date;
    double current_value;

    public Asset(String descriptor, String date, double current_value) {
        this.descriptor = descriptor;
        this.date = date;
        this.current_value = current_value;
    }

    abstract void displayDetails();
}

class Stock extends Asset {
    int num_shares;
    double share_price;
    double asset;

    public Stock(String descriptor, String date, double current_value, int num_shares, double share_price,double asset) {
        super(descriptor, date, current_value);
        this.num_shares = num_shares;
        this.share_price = share_price;
        this.asset = asset;
    }

    @Override
    void displayDetails() {
        System.out.println("Stock Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Number of Shares: " + num_shares);
        System.out.println("Share Price: " + share_price);
        System.out.println("Asset : " + asset);
    }
}

class Bond extends Asset {
    double interest_rate;
    double asset;

    public Bond(String descriptor, String date, double current_value, double interest_rate,double asset) {
        super(descriptor, date, current_value);
        this.interest_rate = interest_rate;
        this.asset = asset;
    }

    @Override
    void displayDetails() {
        System.out.println("Bond Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Interest Rate: " + interest_rate);
        System.out.println("Asset : " + asset);
    }
}

class Savings extends Asset {
    double interest_rate;
    double asset;

    public Savings(String descriptor, String date, double current_value, double interest_rate,double asset) {
        super(descriptor, date, current_value);
        this.interest_rate = interest_rate;
        this.asset = asset;
    }

    @Override
    void displayDetails() {
        System.out.println("Savings Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Interest Rate: " + interest_rate);
        System.out.println("Asset : " + asset);
    }
}
public class Q_10 {
    public static void main(String[] args) {
        Stock stock = new Stock("TechCorp", "2024-03-21", 5000.0, 100, 50.0, 500);
        stock.displayDetails();

        Bond bond = new Bond("Government Bond", "2024-03-21", 10000.0, 3.5,2000);
        bond.displayDetails();

        Savings savings = new Savings("Personal Savings", "2024-03-21", 20000.0, 2.0,5000);
        savings.displayDetails();
    }
}

