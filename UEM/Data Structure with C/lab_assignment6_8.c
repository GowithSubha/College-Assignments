// Write a program to solve the tower of Hanoi problem using recursion.

#include <stdio.h>

// define a function to move n disks from source rod to destination rod using auxiliary rod
void towerOfHanoi(int n, char source, char destination, char auxiliary)
{
    if (n == 1)
    {                                                                       // base case
        printf("Move disk 1 from rod %c to rod %c\n", source, destination); // print the move
        return;                                                             // return from the function
    }
    towerOfHanoi(n - 1, source, auxiliary, destination);                    // recursive call to move n-1 disks from source to auxiliary using destination
    printf("Move disk %d from rod %c to rod %c\n", n, source, destination); // print the move
    towerOfHanoi(n - 1, auxiliary, destination, source);                    // recursive call to move n-1 disks from auxiliary to destination using source
}

// define the main function
int main()
{
    int n; // declare a variable to store the number of disks
    printf("Enter the number of disks: ");
    scanf("%d", &n); // read the number of disks from the user
    printf("The sequence of moves involved in the Tower of Hanoi are:\n");
    towerOfHanoi(n, 'A', 'C', 'B'); // call the function to solve the problem with A, B and C as the rods
    return 0;                       // return 0 to indicate successful termination
}
