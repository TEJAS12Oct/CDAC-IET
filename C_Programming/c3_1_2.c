/*
Q1.Write user defined function to accept number from user and find the square of that number and 
display it in function itself.(declaration,definition and call required)
void find_square(int n){}
*/


#include<stdio.h>

int find_square(int  n);
int main()
{
	int n,square;
	printf("Enter the number");
	scanf("%d",&n);
	square = find_square(n);
	printf("square = %d",square);
	return 0;
}
	int find_square(int n)
		{
			int square;
			square = n*n;
			return square;
		}
	
	
