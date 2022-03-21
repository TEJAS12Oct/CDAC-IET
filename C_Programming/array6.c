// Get Small no using array

#include<stdio.h>
int get_small_no(int brr[5]);

int main()
{
	int arr[5];
	printf("Enter the 5 no = ");
	
	int  i;
	for(i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	int ret = get_small_no(arr);
	printf("smallest number : %d\n",ret);
	return 0;
}

int get_small_no(int brr[5])
{
	int smallest = 999999999;
	int i;
	for (i=0;i<5;i++)
	{
		if (brr[i] <  smallest)
		{
			smallest = brr[i];
		}
	}
	return smallest;
	
}

