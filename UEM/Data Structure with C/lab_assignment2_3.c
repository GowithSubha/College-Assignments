// 3. Write a C program to pass an array to a function using Call by Reference, update the array values in the function, print the array elements both in the function and in the calling function.
#include<stdio.h>
void call_by_reference(int arr[], int y)
{
    int i;
    for ( i = 0; i < y; i++)
    {
        arr[i] = arr[i] + 10;
    }
    // printing the updated array in the called function
    printf("The updated array is:\n");
    for ( i = 0; i < y; i++)
    {
        printf("%d \n", arr[i]);
    }
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
    call_by_reference(arr, num);
    // printing the updated array in the original calling function
    printf("The updated array is:\n");
    for ( i = 0; i < num; i++)
    {
        printf("%d \n", arr[i]);
    }

    return 0;
}

