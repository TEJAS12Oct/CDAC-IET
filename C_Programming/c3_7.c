/*
Q7.Write a function to check whether entered number is Armstrong number or not. (Form the function on 
your own give relevant name )
(if Number is 153 =(1*1*1)+(5*5*5)+(3*3*3) =153 Cube of addition of individual digits is that number 
itself.).(do it by call by value). (Form the function on your own give relevant name )
*/


#include<stdio.h>
void  armstrong(int n);
int main()
{
	int n;
    printf("Enter any number: ");
    scanf("%d", &n);    
    armstrong(n);
	return 0;
}
void armstrong(int n)
{
	int  n1,sum = 0, rem;
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
}