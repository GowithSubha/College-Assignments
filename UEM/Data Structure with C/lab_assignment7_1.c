// Data Set - : 27, 15, 39, 21, 28, 70 
// Write a C program to implement the concept of Bubble sort on the above data set.Print the data set after every iteration.

#include <stdio.h>

void bubbleSort(int arr[], int n)
{
    int i, j, temp;
    for (i = 0; i < n - 1; i++)
    {
        for (j = 0; j < n - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        printf("Iteration %d: ", i + 1);
        for (j = 0; j < n; j++)
        {
            printf("%d ", arr[j]);
        }
        printf("\n");
    }
}

int main()
{
    int arr[] = {27, 15, 39, 21, 28, 70};
    int n = sizeof(arr) / sizeof(arr[0]);
    printf("Original array: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
    bubbleSort(arr, n);
    printf("Sorted array: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
    return 0;
}
// Output:
// Original array: 27 15 39 21 28 70
// Iteration 1: 27 15 39 21 28 70
// Iteration 2: 27 15 21 39 28 70
// Iteration 3: 27 15 21 28 39 70
// Iteration 4: 27 15 21 28 39 70
// Sorted array: 15 21 27 28 39 70
