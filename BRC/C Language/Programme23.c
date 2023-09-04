// Write a program to display nth term Fibonacci series where n is given by the user.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    int i, n, t1 = 0, t2 = 1, nextTerm;     
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    printf("Fibonacci Series: ");

    for (i = 1; i <= n; i++) 
    {
        printf(" %d, ", t1);
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
    }
    return 0;
}



