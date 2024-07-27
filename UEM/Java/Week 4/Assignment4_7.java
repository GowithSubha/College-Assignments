// <!-- An educational institution maintains a database of its employees. The database is divided into a number of classes whose hierarchical relationships are shown below. Write all the classes and define the methods to create the database and retrieve individual information as and when needed.
// Write a driver program to test the classes.
// Staff (code, name) 				                Teacher (subject, publication) is a Staff 
// Officer (grade) is a Staff 				        Typist (speed) is a Staff 
// RegularTypist (remuneration) is a Typist 		CasualTypist (daily wages) is a Typist. -->

class Staff {
    private int code; 
    private String name; 
    public Staff(int code, String name) {
      this.code = code;
      this.name = name;
    }
      public int getCode() {
      return code;
    }
      public String getName() {
      return name;
    }
      public void display() {
      System.out.println("Staff code: " + code);
      System.out.println("Staff name: " + name);
    }
  }
    class Teacher extends Staff {
    private String subject;
    private String publication; 
    public Teacher(int code, String name, String subject, String publication) {
      super(code, name); 
      this.subject = subject;
      this.publication = publication;
  
    }  
    public String getSubject() {
      return subject;
  
    }
    public String getPublication() {
      return publication;
    }
    public void display() {
      super.display(); 
      System.out.println("Subject: " + subject);
      System.out.println("Publication: " + publication);
    }
  }
    class Officer extends Staff {
    private String grade; 
    public Officer(int code, String name, String grade) {
      super(code, name);
      this.grade = grade;
    }
    public String getGrade() {
      return grade;
    }
    public void display() {
      super.display(); 
      System.out.println("Grade: " + grade);
    }
  }
    class Typist extends Staff {
    private int speed; 
    public Typist(int code, String name, int speed) {
      super(code, name); 
      this.speed = speed;
    }
    public int getSpeed() {
      return speed;
    }
    public void display() {
      super.display(); 
      System.out.println("Speed: " + speed + " wpm");
    }
    }
  class RegularTypist extends Typist {
    private double remuneration; 
    public RegularTypist(int code, String name, int speed, double remuneration) {
      super(code, name, speed); 
      this.remuneration = remuneration;
    }
      public double getRemuneration() {
      return remuneration;
    }
      public void display() {
      super.display(); 
      System.out.println("Remuneration: " + remuneration + " per month");
    }
    }
  class CasualTypist extends Typist {
    private double dailyWages; 
    public CasualTypist(int code, String name, int speed, double dailyWages) {
      super(code, name, speed); 
      this.dailyWages = dailyWages;
    }
  
    public double getDailyWages() {
      return dailyWages;
    }
      public void display() {
      super.display(); 
      System.out.println("Daily wages: " + dailyWages + " per day");
    }
  }
    public class Assignment4_7 {
      public static void main(String[] args) {
      Staff s1 = new Staff(6015033, "Najifa");
      Teacher t1 = new Teacher(6015011, "Mr. Aaul", "DSA", "Pearson");
      Officer o1 = new Officer(6015012, "Manoj", "A+");
      RegularTypist r1 = new RegularTypist(6015032, "Prayas", 80, 50000);
      CasualTypist c1 = new CasualTypist(6015011, "Subha", 60, 820);
      System.out.println("Staff details:");
      s1.display();
      System.out.println();
      System.out.println("Teacher details:");
      t1.display();
      System.out.println();
      System.out.println("Officer details:");
      o1.display();
      System.out.println();
      System.out.println("Regular typist details:");
      r1.display();
      System.out.println();
      System.out.println("Casual typist details:");
      c1.display();
      System.out.println();
      }
    }
