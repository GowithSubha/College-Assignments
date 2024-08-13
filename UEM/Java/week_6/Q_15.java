/*
 Program to create a interface 'Mango' and implement it in classes 'Winter' and 'Summer'..
*/
interface Mango {
    void displayTaste(); }

class Winter implements Mango {
    public void displayTaste() {
        System.out.println("Winter mangoes are sweet and tangy.");
    }
}

class Summer implements Mango {
    public void displayTaste() {
        System.out.println("Summer mangoes are juicy and sweet.");
    }
}

public class Q_15 {
    public static void main(String[] args) {
        Mango winterMango = new Winter();
        System.out.println("Taste of Winter Mango:");
        winterMango.displayTaste();

        Mango summerMango = new Summer();
        System.out.println("Taste of Summer Mango:");
        summerMango.displayTaste();
    }
  }

