import java.util.Scanner;

public class Admission{
    static boolean isEligible(int[] marks){
        int total=marks[0]+marks[1]+marks[2];
        return (marks[0]>=60 && marks[1]>=50 && marks[2]>=40 && total>=200)||(marks[0]+marks[1]>=150);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[][] marks=new int[n][3];

        for(int i=0;i<n;i++){
            System.out.println("Enter the marks of student no."+(i+1));
            System.out.print("Maths: ");
            marks[i][0]=sc.nextInt();
            System.out.print("Physics: ");
            marks[i][1]=sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][2]=sc.nextInt();
        }
        System.out.println("The eligible candidates are: ");
        for(int i=0;i<n;i++){
            if (isEligible(marks[i])){
                System.out.println("Student: "+(i+1));
            }
        }
        sc.close();
    }
}
//output
//Enter the number of students: 3
//Enter the marks of student no.1
//Maths: 100
//Physics: 98
//Chemistry: 96
//Enter the marks of student no.2
//Maths: 96
//Physics: 98
//Chemistry: 79
//Enter the marks of student no.3
//Maths: 100
//Physics: 84
//Chemistry: 95
//The eligible candidates are: 
//Student: 1
//Student: 2
//Student: 3
