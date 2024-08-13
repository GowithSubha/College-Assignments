abstract class AbstractProduct{
    protected String Product_ID;
    protected String Name;
    protected String Description;

    public AbstractProduct(String Product_ID, String Name, String Description){
        this.Product_ID = Product_ID;
        this.Name = Name;
        this.Description = Description;
    }
}

class Product extends AbstractProduct{
    double Price;
    Product(String Product_ID,double Price, String Name, String Description){
        super(Product_ID, Name, Description);
        this.Price = Price;
    }
}
class Book extends Product{
    double ISBN;
    String Author;
    String Title;
    Book(String product_ID2,double price, String Name, String description,double ISBN, String Author,String Title){
        super(product_ID2, price, Name, description);
        this.Author = Author;
        this.ISBN = ISBN;
        this.Title = Title;
    }
}
class TravelGuide extends Book{
    String Country;
    TravelGuide(String product_ID2,double price, String Name, String description,double ISBN, String Author,String Title,String Country){
        super(product_ID2, price, Name, description, ISBN, Author, Title);
        this.Country= Country;
    }
}
class Compactdisc extends Product{
    String Artist;
    String Title;
    Compactdisc(String Product_ID, String Name,double Price, String Description,String Artist, String Title){
        super(Product_ID, Price, Name, Description);
        this.Artist= Artist;
        this.Title = Title;
    }
}
public class Q_11 {
   public static void main(String[] args) {
    TravelGuide tg = new TravelGuide("W15", 500, "Hello world","Hello to world", 582, "ayan", "Ayan Title", "India");
    Compactdisc cd = new Compactdisc("r33", "DiscAyan",1000, "Let's Play thi music", "Ayan", "Music Title");

    System.out.println("\n=======================\nBook Details :\n======================= ");
    System.out.println("Product_ID : "+ tg.Product_ID+
                        "\nPrice : "+ tg.Price+
                        "\nName : " + tg.Name+
                        "\nDescription : "+ tg.Description+
                        "\nISBN : "+ tg.ISBN+
                        "\nAuthor : "+ tg.Author+
                        "\nTitle : "+ tg.Title+
                        "\nCountry :"+ tg.Country);
    
    System.out.println("\n===========================\nComact Disc Details :\n=========================== ");
    System.out.println("Product_Id : "+ cd.Product_ID+
                        "\nPrice : "+ cd.Price+
                        "\nName : "+ cd.Name+
                        "\nDescription : "+ cd.Description+
                        "\nArtist : " + cd.Artist+
                        "\nTitle : "+ cd.Title);
   }
}

