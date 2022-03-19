/*
Q4.Write user defined function to return sum of two numbers to main() and display the result in 
main().(make use of return statement)
Int sum(int n1,int n2) {
Your code ….
return result;}
*/

#include<stdio.h>
int sum(int n1,int  n2);
int  main()
{
	int n1,n2,results;
	printf("enter the two number = ");
	scanf("%d%d",&n1,&n2);
	results = sum(n1,n2);
	printf("sum = %d",results);
	return 0;
}
int sum (int n1,int n2)
{
	int sum;
	sum = n1 + n2;
	return  sum;
}