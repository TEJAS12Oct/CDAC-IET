//6. Write a Program to calculate simple interest.


#include<stdio.h>
int main()
{
	float SI,P,R,T;
	printf(" Enter the value of P");
	scanf("%f",&P);
	
	printf(" Enter the value of R");
	scanf("%f",&R);
	
	printf(" Enter the value of T");
	scanf("%f",&T);
	
	SI = P*R*T/100;
	
	printf("SI = %f",SI);
	return 0;

}