/*
Q3.Write a program to Concatenate two arrays in 3rd
 array .(for example- if array1 contains 5 
elements and array2 contains 5 elements then array 2 should have elements from array 1 
followed by elements from array2)


Array concaetation
array 1 = 1 2 3 4 5
array 2 = 6 7 8 9 10 
array merge =  6 7 8 9 10 1 2 3 4 5 

*/

#include<stdio.h>
#define size1 5
#define size2 10

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
	
	printf("Enter the value of 2st array = ");
	for(i=0;i<5;i++)
	{
		scanf("%d",&arr2[i]);
	}
	
	printf("\nElements of Array After Merge: ");
	for(i=0;i<5;i++)
	{
		arr2[i+5] = arr1[i];
	}
	for(i=0;i<10;i++)
   {
		printf(" %d",arr2[i]);
   }
	return 0;
}
