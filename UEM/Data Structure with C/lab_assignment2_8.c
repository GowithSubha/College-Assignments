// 8. Write a C program to search an element in an Array using dynamic memory allocation.
#include<stdio.h>
#include<stdlib.h>
int main(int argc, char const *argv[])
{
    int num, i, search;
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
    printf("Enter the element to be searched\n");
    scanf("%d", &search);
    for ( i = 0; i < num; i++)
    {
        if (arr[i] == search)
        {
            printf("The element is found at %d position\n", i+1);
            break;
        }
    }
    if (i == num)
    {
        printf("The element is not found\n");
    }
    return 0;
}