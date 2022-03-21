//9. Write a C Program to find largest number among two numbers.



#include<stdio.h>
int main()
{
	int n1,n2;
	printf("Enter Two  Number");
	scanf("%d%d",&n1,&n2);
	
	if(n1>n2)
		printf("large No= %d", n1);
	else if (n2>n1)
		printf("large No= %d", n2);
	else
		printf("Both Are Equal");
	return 0;
}