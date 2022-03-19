/*
Q5.Write user defined function to find sum of digits of user entered number and display the sum in 
main().(for Ex-if number is 123 output should be 1+2+3=6. 
6 should get displayed)(Form the function on 
your own give relevant name )
*/

#include<stdio.h>
int add(int n);
int main()
{
	int  n,results;
	printf("Enter the number = ");
	scanf("%d",&n);
	results = add(n);
	printf("addition of  number = %d",results);
	return 0;
}

int add(int n)
{
	int  a,b,c,d,add;
	a = n/100;
	b = n%100;
	c = b/10;
	d = b%10;
	add = a+c+d;
	return add;
	
}