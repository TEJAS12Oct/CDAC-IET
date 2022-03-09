// Pattern Problem
/*

        * 
      * * 
    * * * 
  * * * * 
* * * * *

*/


#include<stdio.h>
int main()
{
	int  i,j,n;
	printf("\nEnter the number of rows : ");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{
		for(j=i;j<=n;j++)
		{
			printf(" ");
		}
		for(int k=1;k<=i;k++)
		{
			printf("*");
		}
		
		printf("\n");
	}
	return 0;
}







