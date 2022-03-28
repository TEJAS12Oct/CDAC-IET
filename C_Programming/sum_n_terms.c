/*
    Sum  of this series upto n terms;
    1 + 2 + 4 + 7 + 11 + 16 + .....n terms
*/

#include<stdio.h>
int main()
{
	
	int n,i,term,sum;
	term = 1;
	sum = 0;
	printf("Enter The Number = ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{ 
	  sum = sum + term;
	  term = term + i;
	}
	printf("i = %d\n",i);
	printf("sum = %d\n",sum);
	return 0;
	
}
