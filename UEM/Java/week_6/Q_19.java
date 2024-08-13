interface Exam{
    void percent_cal();
}
class student{
    String name;
    int roll_no;
    float marks1,marks2;
    student(String name, int roll_no,float marks1,float marks2){
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.name = name;
        this.roll_no = roll_no;
    }
    void show(){
        System.out.println("Student Details(This is from the student class) :");
    }
}
class Result extends student implements Exam{
    Result(String name, int roll_no,float marks1,float marks2){
        super(name, roll_no, marks1, marks2);
    }
    @Override
    public void percent_cal() {
        float per =  ((marks1/marks2)*100);
        System.out.println("Persentage the student get :  " + per+"\n");
    }

    void display(){
        System.out.println("Name : "+ name+
                           "\nRoll_No. : "+ roll_no+
                           "\nMarks : "+marks1+
                           "\nFull Marks : "+marks2 );
        percent_cal();
    }
}
public class Q_19 {
    public static void main(String[] args) {
        Result r = new Result("Ayan Das", 7, 23, 30);
        r.show();
        r.display();
 }
}
