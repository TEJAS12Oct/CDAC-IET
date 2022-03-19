// Array problem 


#include<stdio.h>
int main()
{
	
	int arr[5];
	printf(" Enter the 5 no = ");
	int i;
	for(i=1;i<=5;i++)
	{
		
	scanf("%d",&arr[i]);
	}
	for(i=1;i<=5;i++)
	{
		
	printf("\narr[i] = %d, &arr[i] = %d\n",arr[i],&arr[i]);
	}
	return 0;
}