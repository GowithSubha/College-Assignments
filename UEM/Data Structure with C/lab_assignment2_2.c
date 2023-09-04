// 2. Write a C program to pass an array to a function using Call by Value, update the array values in the function, print the array elements both in the function and in the calling function.
#include<stdio.h>
void call_by_value(int n)
{
    n = n + 10;
    printf("The updated value of n is %d\n", n);
}
int main(int argc, char const *argv[])
{
    int num, i;
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
    call_by_value(arr[0]);
    printf("The updated value of arr[0] is %d\n", arr[0]);
    
    return 0;
}