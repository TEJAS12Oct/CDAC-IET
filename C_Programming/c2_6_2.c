//Write a C Program to square of even numbers from 1 to 10.
//(Do the program using do.. while loop)



#include<stdio.h>
int main()
{
	int i,n,square;
	printf("enter the number\n");
	scanf("%d",&n);
	
	i=1;
	
	do{
	printf("i = %d\n",i);
	if(i%2==0){
	printf("Even No %d\n",i);
    square = i * i;
	printf(" square of even  number  = %d\n",  square);
	}
	i++;
	}while(i<=n);
	
	
	return 0;
}