//15.Write a Menu driven program to do all arithmetic operations


#include<stdio.h> 

int main()
{
    int num1; 
    int num2; 
    int ans; 
    int choice; 

    printf("1.Addtion\n");
    printf("2.Multplication\n");
    printf("3.Substraction\n");
    printf("4.Division\n");

    printf("Enter the num1 and num2"); 
    scanf("%d%d",&num1,&num2);  

    printf("Enter the choice"); 
    scanf("%d",&choice); 

    switch (choice) 
    {
    case 1: 
        ans = num1 + num2;
        printf("%d",ans);   
        break;
     case 2: 
        ans = num1 * num2;
        printf("%d",ans);   
        break;
   
    case 3: 
        ans = num1 - num2;
        printf("%d",ans);   
        break;
   
    case 4: 
        ans = num1 / num2;
        printf("%d",ans);   
        break;
   

    default:
        printf("Invalid choice"); 
        break;
    }
}