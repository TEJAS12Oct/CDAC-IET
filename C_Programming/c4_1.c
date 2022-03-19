//Q1.Accept array elements of 5 integers and find sum of array elements and display it


#include<stdio.h>
int main()
{
	
	int arr[5];
	printf("Enter the 5 no = ");
	int i;
	for(i=1;i<=5;i++)
	{
		
	scanf("%d",&arr[i]);
	}
	int sum =0;
	for(i=1;i<=5;i++)
	{
	sum = sum + arr[i];	
	}
	printf("sum = %d\n",sum);
	printf("Avg = %f\n",(float)sum/5);
	
	
	return 0;
}