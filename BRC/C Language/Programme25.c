// Write a program to display sum of the series S=1+x +x2/2! +x3/3! +x4/4! +x5/5! + x6/6!, where the value of x is given by the user.
#include <stdio.h>
int main(int argc, char const *argv[])
{
    float p=1,t=1;
	int i,x;
    printf("Sum of this series S = 1+x +x^2/2! +x^3/3! +x^4/4! +x^5/5! + x^6/6! \n");
    
	printf("Enter the value of x: ");
	scanf("%d",&x);
	for(i=1;i<=6;i++)
	{
		t=t*x/i;
		p=p+t;
	}
	printf("The sum of this series: %.2f \n",p);
    return 0;
}
