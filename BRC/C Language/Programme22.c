// Write a program to display the sum of n numbers where n is given by the user.
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int num1,i=1,s=0;
	printf("Enter the value of n: ");
	scanf("%d",&num1);
	while(i<=num1)
	{
		s=s+i;
		i++;
	}
	printf("The sum of then numbers: %d \n",s);
    return 0;
}
