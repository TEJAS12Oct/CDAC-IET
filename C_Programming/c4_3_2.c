/*

Q3.Write a program to Concatenate two arrays in 3rd
 array .(for example- if array1 contains 5 
elements and array2 contains 5 elements then array 2 should have elements from array 1 
followed by elements from array2)


Array concaetation using function
array 1 = 1 2 3 4 5
array 2 = 6 7 8 9 10 
array merge =  6 7 8 9 10 1 2 3 4 5 

*/

#include<stdio.h>
void aceept_array1();
void aceept_array2();
void aceept_merge();
#define size1 5
#define size2 10
int main()
{

	aceept_array1();
	aceept_array2();
	aceept_merge();

	return 0;
}
void aceept_array1()
{
	printf("Enter the value of 1st array = ");
    int i;
	int arr1[size1];
	for(i=0;i<size1;i++)
	{
		scanf("%d",&arr1[i]);
	}
}

void aceept_array2()
{   
	printf("Enter the value of 2st array = ");
	int i;
	int arr2[size2];
	for(i=0;i<5;i++)
	{
		scanf("%d",&arr2[i]);
	}
	
}

void aceept_merge()
{
	printf("\nElements of Array After Merge: ");
	int i;
	int arr1[size1];
	int arr2[size2];
	for(i=0;i<5;i++)
	{
		arr2[i+5] = arr1[i];
	}
	for(i=0;i<10;i++)
   {
		printf(" %d",arr2[i]);
   }
}