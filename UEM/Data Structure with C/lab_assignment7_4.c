// write a c program to implementation the concept of quick sort of given dataset (Data set: 27,15,39,21,28,70) print the data in every iteration

#include <stdio.h>

void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

int partition(int arr[], int low, int high)
{
    int pivot = arr[high];
    int i = (low - 1);
    for (int j = low; j <= high - 1; j++)
    {
        if (arr[j] < pivot)
        {
            i++;
            swap(&arr[i], &arr[j]);
        }
    }
    swap(&arr[i + 1], &arr[high]);
    printf("Iteration %d: ", i + 2);
    for (int j = 0; j < high + 1; j++)
    {
        printf("%d ", arr[j]);
    }
    printf("\n");
    return (i + 1);
}

void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
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
    quickSort(arr, 0, n - 1);
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
Iteration 6: 27 15 39 21 28 70
Iteration 4: 27 15 21 28 39
Iteration 2: 15 21 27
Sorted array: 15 21 27 28 39 70
*/