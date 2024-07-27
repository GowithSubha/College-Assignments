// write a c program to implementation the concept of insertion sort of given dataset (Data set: 27,15,39,21,28,70) print the data in every iteration

#include <stdio.h>

void insertionSort(int arr[], int n)
{
    int i, j, key;
    for (i = 1; i < n; i++)
    {
        key = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
        printf("Iteration %d: ", i);
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
    insertionSort(arr, n);
    printf("Sorted array: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
    return 0;
}

/*
Output:
Original array: 27 15 39 21 28 70
Iteration 1: 15 27 39 21 28 70
Iteration 2: 15 27 39 21 28 70
Iteration 3: 15 21 27 39 28 70
Iteration 4: 15 21 27 28 39 70
Iteration 5: 15 21 27 28 39 70
Sorted array: 15 21 27 28 39 70

*/