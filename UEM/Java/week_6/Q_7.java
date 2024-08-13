/*Create an interface called Player. 
  The interface has an abstract method called play()that displays a message describing the meaning of “play” to the class. 
  Create classes called Child, Musician, and Actor that all implement Player.
  Create an applicationthat demonstrates the use of the classes(UsePlayer.java)*/

interface Player{
    void play();
}
class Child implements Player{
    public void play(){
        System.out.println("Child play..");
        
    }
}
class Musician implements Player{
    public void play(){
        System.out.println("Musician play..");
        
    }

}
class Actor implements Player{
    public void play(){
        System.out.println("Actor play..");
        
    }

}
public class Q_7 {
    public static void main(String[] args) {
        Player C = new Child();
        Player M = new Musician();
        Player A = new Actor();

        System.out.println("Describing the meaning of play : " );
        System.out.println("Child : ");
        C.play();
        System.out.println();

        System.out.println("Musician : ");
        M.play();
        System.out.println();

        System.out.println("Actor : ");
        A.play();
        System.out.println();        
    }   
}