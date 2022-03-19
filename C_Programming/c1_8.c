//8. Write a C program to check whether a person is eligible for voting or not? 
//When age is given or input through the user?


#include<stdio.h>
int main()
{
	int n;
	printf("Enter the Age");
	scanf("%d",&n);
	
	if(n>=18){
		printf("Person is eligible for voting");
	}
	else{
		printf("Person is not eligible for voting");
	}
		
	
	return 0;
}

