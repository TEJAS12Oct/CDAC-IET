// Write a C Program to print sum of 1 to 10 Natural numbers. (Use while loop)


#include<stdio.h>
int main()
{
	int i,sum;
	sum = 0;
	i=1;
	while(i<=10){
	sum = sum + i;
	printf("n = %d\n",i);
	i++;
	}
	printf(" sum  = %d",  sum);
	return 0;
}