// Write a C program to show that merge sort is more effective than quick sort.

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// A function to swap two elements
void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

// A function to partition the array using the last element as the pivot
int partition(int arr[], int low, int high)
{
    int pivot = arr[high]; // pivot element
    int i = low - 1;       // index of smaller element

    for (int j = low; j <= high - 1; j++)
    {
        // If current element is smaller than or equal to pivot
        if (arr[j] <= pivot)
        {
            i++;                    // increment index of smaller element
            swap(&arr[i], &arr[j]); // swap the elements
        }
    }
    swap(&arr[i + 1], &arr[high]); // swap the pivot element with the correct position
    return i + 1;                  // return the partition index
}

// A function to implement quick sort
void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        // Partition the array and get the pivot index
        int pi = partition(arr, low, high);

        // Recursively sort the subarrays on the left and right of the pivot
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

// A function to merge two sorted subarrays
void merge(int arr[], int l, int m, int r)
{
    int i, j, k;        // indices for left, right, and merged subarrays
    int n1 = m - l + 1; // size of left subarray
    int n2 = r - m;     // size of right subarray
    int L[n1], R[n2];   // temporary arrays to store the subarrays

    // Copy the data to the temporary arrays
    for (i = 0; i < n1; i++)
        L[i] = arr[l + i];
    for (j = 0; j < n2; j++)
        R[j] = arr[m + 1 + j];

    // Merge the temporary arrays back into the original array
    i = 0; // initial index of left subarray
    j = 0; // initial index of right subarray
    k = l; // initial index of merged subarray
    while (i < n1 && j < n2)
    {
        // Compare the elements of the subarrays and put the smaller one in the merged array
        if (L[i] <= R[j])
        {
            arr[k] = L[i];
            i++;
        }
        else
        {
            arr[k] = R[j];
            j++;
        }
        k++;
    }

    // Copy the remaining elements of the left subarray, if any
    while (i < n1)
    {
        arr[k] = L[i];
        i++;
        k++;
    }

    // Copy the remaining elements of the right subarray, if any
    while (j < n2)
    {
        arr[k] = R[j];
        j++;
        k++;
    }
}

// A function to implement merge sort
void mergeSort(int arr[], int l, int r)
{
    if (l < r)
    {
        // Find the middle point to divide the array into two halves
        int m = l + (r - l) / 2;

        // Recursively sort the two halves
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);

        // Merge the two sorted halves
        merge(arr, l, m, r);
    }
}

// A function to print an array
void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

// A function to generate a random array of a given size
void generateArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
        arr[i] = rand() % 100; // generate a random number between 0 and 99
}

// A function to copy an array
void copyArray(int src[], int dest[], int n)
{
    for (int i = 0; i < n; i++)
        dest[i] = src[i];
}

int main()
{
    srand(time(0)); // seed the random number generator

    int n; // size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int arr[n];  // original array
    int arr1[n]; // copy of the original array for quick sort
    int arr2[n]; // copy of the original array for merge sort

    generateArray(arr, n);   // generate a random array
    copyArray(arr, arr1, n); // copy the array for quick sort
    copyArray(arr, arr2, n); // copy the array for merge sort

    // printf("The original array is: \n");
    // printArray(arr, n);

    clock_t start, end; // variables to store the start and end time
    double time_taken;  // variable to store the time taken in seconds

    // Quick sort
    start = clock();                                     // record the start time
    quickSort(arr1, 0, n - 1);                           // sort the array using quick sort
    end = clock();                                       // record the end time
    time_taken = (double)(end - start) / CLOCKS_PER_SEC; // calculate the time taken in seconds
    printf("The time taken by quick sort is: %f seconds\n", time_taken);

    // Merge sort
    start = clock();                                     // record the start time
    mergeSort(arr2, 0, n - 1);                           // sort the array using merge sort
    end = clock();                                       // record the end time
    time_taken = (double)(end - start) / CLOCKS_PER_SEC; // calculate the time taken in seconds
    printf("The time taken by merge sort is: %f seconds\n", time_taken);


    return 0;
}

// output:
// Enter the size of the array: 10000
// The time taken by quick sort is: 0.004000 seconds
// The time taken by merge sort is: 0.002000 seconds
// The time taken by quick sort is: 0.004000 seconds
// The time taken by merge sort is: 0.001000 seconds


// output:
// Enter the size of the array: 10000
// The time taken by quick sort is: 0.004000 seconds
// The time taken by merge sort is: 0.002000 seconds