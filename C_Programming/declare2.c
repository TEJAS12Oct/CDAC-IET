//declaration variable using ketword = static/global/extern/local

//Static

#include<stdio.h>
int j=10;

void fun(int  n)
{
	static int j;
	j = 20;
	printf("j = %d\n",j); // j = 20
}
int main()
{
	int n;
	fun(n);
	printf("j=%d",j);  // j = 10
	return 0;
}