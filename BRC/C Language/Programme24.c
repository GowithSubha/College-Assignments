// Write a program to display the sum of the series s=1+ x +x^2 +x^3 +x^4 +x^5 , where the value of x is given by the user.
#include<stdio.h>
#include<math.h>
int main(int argc, char const *argv[])
{
    int s=1,X,i=1;
    printf("Calculate the sum of Series: 1+ x +x^2 +x^3 +x^4 +x^5 \n");
	printf("Enter the value of X: ");
	scanf(" %d",&X);
    for ( i = 1; i <= 5; i++)
    {
        s=s+pow(X,i);  
    }
    
	printf(" %d",s);
    return 0;
}
