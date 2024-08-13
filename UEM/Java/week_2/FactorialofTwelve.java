public class FactorialofTwelve {
    public static void main(String[] args) {
        int fact=1;
        int num=12;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of 12: "+fact);

    }
}

//Output
//The factorial of 12: 479001600
