// 7. Write a program to allocate memory using calloc() and then reallocate the previously allocated memory using realloc().Display the elements which have been taken after reallocation.
#include<stdio.h>
#include<stdlib.h>
int main(int argc, char const *argv[])
{
    int num, i;
    printf("Enter the number of elements of arrays\n");
    scanf("%d", &num);
    printf("Enter the elements of the array \n");
    int *arr = (int *)calloc(num, sizeof(int));
    for ( i = 0; i < num; i++)
    {
        scanf("%d", &arr[i]);   
    }
    printf("The elements are:\n");
    for ( i = 0; i < num; i++)
    {
        printf("%d \n", arr[i]);
    }
    printf("Enter the new size of the array\n");
    scanf("%d", &num);
    arr = (int *)realloc(arr, num * sizeof(int));
    printf("Enter the elements of the array \n");
    for ( i = 0; i < num; i++)
    {
        scanf("%d", &arr[i]);   
    }
    printf("The elements are:\n");
    for ( i = 0; i < num; i++)
    {
        printf("%d \n", arr[i]);
    }
    return 0;
}