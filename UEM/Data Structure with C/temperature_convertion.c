// converting temperature from centigrade to fahrenheit

#include<stdio.h>
int main(int argc, char const *argv[])
{
    float celsius, fahrenheit;
    printf("Enter the temperature in celsius\n");
    scanf("%f", &celsius);
    fahrenheit = (celsius * 9/5) + 32;
    printf("The temperature in fahrenheit is %f", fahrenheit);
    return 0;
}