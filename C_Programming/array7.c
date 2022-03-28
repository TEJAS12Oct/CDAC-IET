// Get Small no using array

#include<stdio.h>
void get_no(int brr[5]);
void display_array(int crr[5]);
int get_small_no(int drr[5]);
int main()
{
	int arr[5];
	printf("Enter the 5 no = ");
	
	
	get_no(arr);
	display_array(arr);
	int ret = get_small_no(arr);
	
	printf("smallest number : %d\n",ret);
	return 0;
}

void get_no(int brr[5])
//void get_no(int *brr)
{
	int  i;
	for(i=0;i<5;i++)
	{
		scanf("%d",&brr[i]);
		
	}
	
}

void display_array(int crr[5])
{
	int i;
	for (i=0;i<5;i++)
	{
		printf("%d ",crr[i]);
	}
	printf("\n");
}

int get_small_no(int drr[5])
{
	int smallest = 999999999;
	int i;
	for (i=0;i<5;i++)
	{
		if (drr[i] <  smallest)
		{
			smallest = drr[i];
		}
	}
	return smallest;
	
}

