/*
Q3.Write user defined function to accept number from user and find factorial of that number.
void find_fact(int n){}
(for ex. if number entered is 5 then output should be 120)
*/

#include<stdio.h>
void  find_fact(int n);
int main()
{
	int n;
	printf("Enter the number");
	scanf("%d",&n);
	find_fact(n);
	}

void find_fact(int n)
{
	int i,fact=1;
	for(i=1;i<=n;i++){
		fact = fact*i;
	}
	printf("factorial = %d", fact);
}