// 5. Write a program to display n number of elements.Memory should be allocated dynamically using calloc().
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
    return 0;
}