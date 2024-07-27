// Create a class called Complex, which has three private instance variables –real and imaginary. It contains a method called add( ) which takes one Complex object as parameter and print the added value of the calling Complex object and passes Complex object. In the main method, declare two Complex objects and assign values using constructor and call the add() method. 
class Complex{
  private int real, imaginary;

  Complex(int real, int imaginary){
    this.real = real;
    this.imaginary = imaginary;
  }	
  void add(Complex otherNum){
    int newReal = this.real + otherNum.real;
    int newImaginary = this.imaginary + otherNum.imaginary;

    System.out.println("Sum: " + newReal + " + i" + newImaginary);
  }
}
public class Week5_Q3 {
  public static void main(String[] args) {
    Complex num1 = new Complex(18, 90);
    Complex num2 = new Complex(78, 45);
    num1.add(num2);
  }
}
