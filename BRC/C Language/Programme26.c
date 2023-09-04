// Write a program to display sum of the series S= 1+11+111+1111+11111.
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int i, Sum = 0, p = 0;
    printf("\nSum of the series S= 1+11+111+1111+11111 \n");
    
	for(i=1;i<=5;i++)
	{
		p=p*10+1;
		Sum = Sum + p;
	}
	printf("The sum of this series is: %d", Sum );
    return 0;
}
