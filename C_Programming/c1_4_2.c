//4. Write C program to find cube of an integer number using two different methods.
// 2.Using Built-in Function pow()- (Make use of Math.h )


#include<stdio.h>
#include<math.h>
int main()
{
	int n1,n2;
	printf("Enter the Number");
	scanf("%d",&n1);
	n2=pow(n1,3);
	printf("Cube = %d",n2);
	return 0;
}