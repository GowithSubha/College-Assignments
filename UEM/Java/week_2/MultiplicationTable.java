import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String[] args) {
        Scanner ml=new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=ml.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
        ml.close();
    }
}

//output
//Enter the number: 
//15
//15*1=15
//15*2=30
//15*3=45
//15*4=60
//15*5=75
//15*6=90
//15*7=105
//15*8=120
//15*9=135
//15*10=150
//15*11=165
//15*12=180
//15*13=195
//15*14=210
//15*15=225
