// Write a program to take a number and check if the number is palindrome or not.

#include <stdio.h>
int main(int argc, char const *argv[])
{
    int num1,p,s=0,h;
	printf("Enter your number: ");
	scanf("%d",&num1);
	h=num1;
	while(num1>0)
	{
		p=num1%10;
		s=s*10+p;
		num1=num1/10;
	}
	if(h==s)
	printf("Your entered number %d is a palindrome number. \n ",h);
	else
	printf("Your entered number %d is not a palindrome number. \n ",h);

    return 0;
}
