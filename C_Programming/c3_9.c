/*
Q9.Print Multiplication tables from 2 to 10 in a user defined function. (Form the function on your own 
give relevant name )
*/

#include<stdio.h>
void table(int n);
int main()
{
	int n; 
    int result;
	table(n);
	return 0;
}

void table(int n)
{
	int  i=1,n1;
	printf("enter the  number = ");
	scanf("%d",&n1);
	while(i<=10){
		printf("%d * %d = %d\n",n1,i,n1*i);
	i++;
	}
}