//Write a C Program to print multiplication table for user entered number.(Do the program using do.. while as well as while)


#include<stdio.h>
int main()
{
	int n,i=1;
	printf("enter the number\n");
	scanf("%d",&n);
	
	while(i<=10)
	{
		
		printf("%d*%d=%d\n",n,i,n*i);
		i++;
	}
	return 0;
}