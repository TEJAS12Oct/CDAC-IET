//declaration variable using ketword = static/global/extern/local

// global

/*
#include<stdio.h>
int g = 10;
int main()
{
	int n =20;
	printf("global = %d\n",g);
	printf("local = %d",n);
	return 0;
    
	
	//global = 10
    //local = 20
}
*/

/*
#include<stdio.h>
int n = 10;
int main()
{
	int n =20;
	printf("global = %d\n",n);
	printf("local = %d",n);
	return 0;
    //global = 20
    //local = 20
}
*/

#include<stdio.h>
int t = 10;

void fun(int n)
{
	printf("t =%d",t);
}
int main()
{
	int t= 20,n;
	fun(n);
	return 0;
	
	
//t=10;
}

