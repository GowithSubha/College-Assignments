/*Create three interfaces, each with two methods.
 Inherit a new interface from the three, adding a new method. 
 Create a class by implementing the new interface and also inheriting from a concrete class. 
 Now write four methods, each of which takes one of the four interfaces as an argument.
 In main ( ), create an object of your class and pass it to each of the methods. */

 interface InterFace1 {
    void method1();
    void method2();  
 }
 interface InterFace2 {
    void method3();
    void method4();  
 }
 interface InterFace3 {
    void method5();
    void method6();  
 }
interface newOne extends InterFace1, InterFace2, InterFace3{
   void NewMethod();
}

class MyClass implements newOne{
   public void method1(){
      System.out.println("Method 1");
   }
   public void method2(){
      System.out.println("Method 2");
   }
   public void method3(){
      System.out.println("Method 3");
   }
   public void method4(){
      System.out.println("Method 4");
   }
   public void method5(){
      System.out.println("Method 5");
   }
   public void method6(){
      System.out.println("Method 6");
   }
   public void NewMethod(){
      System.out.println("New Method");
   }
}

 public class Q_5 {
   static void One(InterFace1 arg){
      arg.method1();
   }
   static void two(InterFace2 arg){
      arg.method3();
   }
   static void three(InterFace3 arg){
      arg.method5();     
   }
   static void four(newOne arg){
      arg.NewMethod(); 
   }
   public static void main(String[] args) {
      MyClass obj = new MyClass();
      One(obj);
      two(obj);
      three(obj);
      four(obj);
    }    
 }