// Pattern Problem
/*

* * * * *
* * * * 
* * * 
* * 
*  

*/


#include<stdio.h>
int main()
{
	int  i,j,cnt;
	for(i=1;i<=5;i++)
	{
		cnt = 5;
		for(j=5;j>=i;j--)
		{
			printf("* ");
			cnt = cnt -1;
		}
		printf("\n");
	}
	return 0;
}



