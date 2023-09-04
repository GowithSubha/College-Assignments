// Write a program to display even or odd number from 1-50.
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int i;
    for(i=1; i<=50; i++)
    {
        if(i%2==0)
		printf(" %d is a even number \n",i);
		else
		printf(" %d is a odd number \n",i);
    }
    return 0;
}

// #include<stdio.h>
// main()
// {
// 	int i=1;
// 	while(i<=50)
// 	{
// 		if(i%2==0)
// 		printf(" %d is even",i);
// 		else
// 		printf(" %d is odd",i);
// 		i++;
// 	}
// }

