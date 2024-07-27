// Data Set - : 27, 15, 39, 21, 28, 70
// Write a C program to implement the concept of Selection sort on the above data set.      Print the data set after every iteration. 

#include <stdio.h>

    void
    selectionSort(int arr[], int n)
{
    int i, j, min_idx;
    for (i = 0; i < n - 1; i++)
    {
        min_idx = i;
        for (j = i + 1; j < n; j++)
        {
            if (arr[j] < arr[min_idx])
            {
                min_idx = j;
            }
        }
        int temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;
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
    selectionSort(arr, n);
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
// Iteration 1: 15 27 39 21 28 70
// Iteration 2: 15 21 39 27 28 70
// Iteration 3: 15 21 27 39 28 70
// Iteration 4: 15 21 27 28 39 70
// Iteration 5: 15 21 27 28 39 70
// Sorted array: 15 21 27 28 39 70
//