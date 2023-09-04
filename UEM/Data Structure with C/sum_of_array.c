// Write a program to calculate the sum of the elements of an array
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int num, i, sum=0;
    printf("Enter the number of elements of arrays\n");
    scanf("%d", &num);
    printf("Enter the elements of the array \n");
    int arr[num];
    for ( i = 0; i < num; i++)
    {
        scanf("%d", &arr[i]);   
    }
    printf("The elements are:\n");
    for ( i = 0; i < num; i++)
    {
        printf("%d \n", arr[i]);
    }
    for ( i = 0; i < num; i++)
    {
        sum = sum + arr[i];
    }
    printf("The sum of the elements of the array is %d\n", sum);
    return 0;
}
