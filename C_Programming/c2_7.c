//Write a C Program to print ascii values from 0 to 255. (Use for Loop).


#include<stdio.h>
int main()
{
	int i;
	
	
	for(i=0;i<=255;i++)
	{
		printf("%c = %d\n",i,i);
		
	}
	return 0;

}