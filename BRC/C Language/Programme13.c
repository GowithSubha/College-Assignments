// Write a program to calculate addition, subtraction, multiplication, division and modulo operation using switch statement.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    int a,b,c,ch;
    float d;
    printf("\n...............................MENU.................................\n \n");
    printf("Press 1 --> Addition\n");
    printf("Press 2 --> Subtraction\n");
    printf("Press 3 --> Multiplication\n");
    printf("Press 4 --> Division\n");
    printf("Press 5 --> Modulo\n");

    printf("Enter your choice\n");
    scanf("%d",&ch);
    printf("You pressed \t %d \n",ch);

    switch (ch)
    {
    // Addition
    case 1:
        printf("Enter first number= \n "        );
        scanf("%d",&a);
        printf("Enter second number= \n "        );
        scanf("%d",&b);
        c=a+b;
        printf("The Addition is= %d",c);
        break;

    // Subtraction
    case 2:
        printf("Enter first number= \n "        );
        scanf("%d",&a);
        printf("Enter second number= \n "        );
        scanf("%d",&b);
        // c=a-b;
        printf("The Subtration is= %d",c=a-b);
        break;

    // Multiplication
    case 3:
        printf("Enter first number= \n "        );
        scanf("%d",&a);
        printf("Enter second number= \n "        );
        scanf("%d",&b);
        c=a*b;
        printf("The Multiplication is= %d",c);
        break;
    
    // Division
    case 4:
        printf("Enter devidnt value= \n "        );
        scanf("%d",&a);
        printf("Enter divisor value= \n "        );
        scanf("%d",&b);
        d=a/b;
        printf("The quotient is= %f",d);
        break;

    // Modulo
    case 5: 
        printf("Enter devident value= \n "        );
        scanf("%d",&a);
        printf("Enter divisor value= \n "        );
        scanf("%d",&b);
        c = (a%b);
        printf("The Remainder is= %d",c);
        break;
    default: 
        printf("You pressed a wrong key");
        break;
    }
    return 0;
}
