//Write a C Program to print sum of 1 to ‘N’ even numbers. (Use while loop)



#include<stdio.h>
int main()
{
	int i,n,sum;
	printf("enter the number");
	scanf("%d",&n);
	sum = 0;
	i=1;
	while(i<=n)
	{
	printf("i = %d\n",i);
	if(i%2==0){
	printf("Even No %d\n",i);
    sum = sum + i;
	}
	i++;
	}
	
	printf(" sum of even  number  = %d",  sum);
	return 0;
}