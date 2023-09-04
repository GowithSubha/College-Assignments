// Write a program to convert temperature. 1) F to C. 2) C to F.
#include <stdio.h>
int main(int argc, char const *argv[])
{
    float C1, C2, F1, F2;
    printf("\n\n----------------Celsius to Fahrenheit Converter---------------- \n");
    printf("\nEnter temperature in celsius: ");
    scanf("%f", &C1);
    // printf("%.2f \n", C1);
    F1 = (9*C1)/5+32;
    printf("The temperature value in fahrenheit= %.2f \n",F1);
    printf("\n----------------Fahrenheit to Celsius Converter---------------- \n");
    printf("\nEnter temperature in Fahrenheit: ");
    scanf("%f", &F2);
    // printf("%.2f \n", F2);
    C2 = ((5*F2)-160)/9;
    printf("The temperarature value in Celsius= %.2f \n",C2);
    return 0;
}
