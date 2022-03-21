// Q2.Accept array1 of 5 elements copy it to array 2 display Array 2.


#include<stdio.h>
#define size1 5
#define size2 5

int main()
{
	int arr1[size1];
	int arr2[size2];
	int i;
	
	printf("Enter the value of 1st array = ");	
	for(i=0;i<size1;i++)
	{
		scanf("%d",&arr1[i]);
	}
	
	printf("\nCopy Elements of Array1 in Array2: ");
	for(i=0;i<5;i++)
	{
		arr2[i] = arr1[i];
		
	}
	for(i=0;i<5;i++)
   {
		printf(" %d",arr2[i]);
   }
  }