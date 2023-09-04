// Write a program to display the series S= 1+22+333+4444+55555.
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int i, s = 0, p = 0, t = 0;
    printf("Sum of the series S= 1+22+333+4444+55555\n");
    for(i=1;i<=5;i++)
	{
		p=p*10+1;
		s=i*p;
		t=t+s;
	}
	printf("The sum of this series: %d", t);
    return 0;
}
