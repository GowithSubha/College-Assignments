// Write a C program to show that Quick sort is better than Bubble sort.

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

// A function to implement Quick sort
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

// A function to implement Bubble sort
void bubbleSort(int arr[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        // Flag to check if any swap occurred in the current iteration
        int swapped = 0;

        for (int j = 0; j < n - i - 1; j++)
        {
            // Compare adjacent elements and swap them if they are out of order
            if (arr[j] > arr[j + 1])
            {
                swap(&arr[j], &arr[j + 1]);
                swapped = 1; // set the flag to 1
            }
        }

        // If no swap occurred in the current iteration, the array is already sorted
        if (swapped == 0)
            break;
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

// The main function
int main()
{
    srand(time(0)); // seed the random number generator

    int n; // size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int arr[n];  // original array
    int arr1[n]; // copy of the original array for Quick sort
    int arr2[n]; // copy of the original array for Bubble sort

    generateArray(arr, n);   // generate a random array
    copyArray(arr, arr1, n); // copy the array for Quick sort
    copyArray(arr, arr2, n); // copy the array for Bubble sort

    printf("The original array is: \n");
    // printArray(arr, n);

    clock_t start, end; // variables to store the start and end time
    double time_taken;  // variable to store the time taken

    // Quick sort
    start = clock();                                     // record the start time
    quickSort(arr1, 0, n - 1);                           // sort the array using Quick sort
    end = clock();                                       // record the end time
    time_taken = (double)(end - start) / CLOCKS_PER_SEC; // calculate the time taken in seconds
    // printf("The sorted array using Quick sort is: \n");
    // printArray(arr1, n);
    printf("The time taken by Quick sort is: %f seconds\n", time_taken);

    // Bubble sort
    start = clock();                                     // record the start time
    bubbleSort(arr2, n);                                 // sort the array using Bubble sort
    end = clock();                                       // record the end time
    time_taken = (double)(end - start) / CLOCKS_PER_SEC; // calculate the time taken in seconds
    // printf("The sorted array using Bubble sort is: \n");
    // printArray(arr2, n);
    printf("The time taken by Bubble sort is: %f seconds\n", time_taken);

    return 0;
}

// Output:
// Enter the size of the array: 10000
// The original array is:
// The time taken by Quick sort is: 0.003000 seconds
// The time taken by Bubble sort is: 0.372000 seconds