// Create a class called Time, which has three private instance variables – hour, min and sec. It contains a method called add( ) which takes one Time object as parameter and print the added value of the calling Time object and passes Time object. In the main method, declare two Time objects and assign values using constructor and call the add() method. 

class Time{
  private int hour, min, sec;
    Time(int hour, int min, int sec){
    this.hour = hour;
    this.min = min;
    this.sec = sec;
  }	
  void add(Time otherTime){
    int newHour = this.hour + otherTime.hour;
    int newMin = this.min + otherTime.min;
    int newSec = this.sec + otherTime.sec;
    if(newSec >= 60){
      newSec %= 60;
      newMin++;
    }
    if(newMin >= 60){
      newMin %= 60;
      newHour++;
    }
    System.out.println("New Time: " + newHour + ":" + newMin + ":" + newSec);
  }
}
public class Week5_Q2  {
  public static void main(String[] args) {
    Time time1 = new Time(5, 5, 4);
    Time time2 = new Time(3, 20, 10);
    time1.add(time2);
  }
}
