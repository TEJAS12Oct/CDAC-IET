// Write a C Program to check if entered number is Armstrong number or not



#include <stdio.h>

int main() {
    int n ,n1,sum = 0, rem;
    
    printf("Enter any number: ");
    scanf("%d", &n);    
    n1 = n;
    
    
    while (n > 0){
        rem = n % 10;
        sum = sum + rem*rem*rem;
        n = n / 10;
    }
    
    if (n1 == sum){
         printf("This number is Armstrong number");
	}
   else{
      printf("This number is not Armstrong number");
    }    
    return 0; 
} 