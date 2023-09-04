// Write a programme to calculate the factorial of a given number using function:-
#include<stdio.h>
int fact (int);
int main()
{
    int a, b;
    printf("Enter a number to calculate its fact \t");
    scanf("%d", &a);
    b = fact (a);
    printf("The fact is %d", b);
}
int fact ( int a )
{
    int c, f= 1;
    for(c=1;c<=a;c++)
            {
                f=f*c;
            }
            return (f);
}