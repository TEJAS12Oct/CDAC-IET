// Pattern Problem
/*
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5 
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
			printf("%d ", cnt);
			cnt = cnt -1;
		}
		printf("\n");
	}
	return 0;
}