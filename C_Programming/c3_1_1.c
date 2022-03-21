/*
Q1.Write user defined function to accept number from user and find the square of that number and 
display it in function itself.(declaration,definition and call required)
void find_square(int n){}
*/


#include<stdio.h>

void find_square(int  n);
int main()
{
	int n;
	printf("Enter the number");
	scanf("%d",&n);
	find_square(n);
	return 0;
}
	void find_square(int n)
		{
			int square;
			square = n*n;
			printf("square = %d",square);
			
		}
	
	

