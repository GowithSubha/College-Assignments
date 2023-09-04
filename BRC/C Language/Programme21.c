// Write a program to take a number check if the number is prime or not.
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int num1,c = 0,i;
	printf("Enter your number: ");
	scanf("%d", &num1);
	for(i=2;i<num1;i++)
	{
		if(num1%i==0)
        {
		c++;
		break;
        }
	}
	if(c==0)
        {
        printf("Your entered number %d is a prime number.\n",num1);
        }
    else
        {
        printf("Your entered number %d is not a prime number.\n",num1);
        }
    return 0;
}
