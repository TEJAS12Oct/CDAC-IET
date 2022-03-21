//5. Write a C program to find quotient and remainder. 
//Read divisor and dividend and then find the 
//quotient and remainder, results will be printed on the screen.


#include<stdio.h>
#include<math.h>

int main()
{
	int Dividend,Divisor,Quotient,Reminder;
	
	printf("Enter the value of Dividend =");
	scanf("%d",&Dividend);
	
	printf("Enter the value of Divisor =");
	scanf("%d",&Divisor);
	
	Quotient = Dividend / Divisor;
	Reminder = Dividend % Divisor;
	
	printf("Quotient = %d",Quotient);
	printf("Reminder = %d",Reminder);
	return 0;
	
}