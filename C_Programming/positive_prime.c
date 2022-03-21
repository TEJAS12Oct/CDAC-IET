/*
    check positive no in  main function 
	no is positive then  check for positive
	no is negative then check for number
*/
#include<stdio.h>
int check_positive(int n);
void CheckPrime(int n);
int main()
{
	int  n;
	
    check_positive(n);
	
	return 0;
}

int check_positive(int n)
{
	printf("Enter the number = ");
	scanf("%d",&n);
	
	if(n>0)
	{
		printf("no is positive = %d",n);
		CheckPrime(n);
		
	}
	else
	{
		printf("no is negative = %d\n",n);
		return check_positive(n);
		
	}
	return 0;
}
void CheckPrime(int n)
	{	int i,c=0;
		for (i =1; i <= n; i++) 
		{
			if (n % i == 0) 
		{
			c++;
		}
		}
		
			if (c == 2) 
		{
			printf("\n%d is a Prime number",n);
		}
		else {
			printf("\n%d is not a Prime number",n);
			
		}
		
		
	}
	
