/*
Q6.Write user defined function to find entered number is prime or not. )(Form the function on your own 
give relevant name )
*/



#include<stdio.h>
void prime(int  n);
int main()
{
	int n,results;
	printf("enter the number = ");
	scanf("%d",&n);
	prime(n);
	return 0;
}
void prime(int n)
{
	int i,c=0;
	for(i=1;i<=n;i++){
		if (n % i == 0) {
         c++;
       }
	}
	if (c == 2) {
  printf("%d is a Prime number",n);
  }
  else {
  printf("%d is not a Prime number",n);
  }

	
}