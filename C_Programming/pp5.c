// Pattern  Problem

/*
	   *
      * *
     * * *
    * * * *
   * * * * *
  * * * * * *
 * * * * * * *
*/

#include<stdio.h>
int main()
{
	int  i,j,n;
	printf("\nEnter the number of rows : "); //7
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{
		for(j=n;j>i;j--)
		{
			printf(" ");
		}
		for(j=1;j<=i;j++)
		{
			printf(" *");
		}
		printf("\n");
	}
	return 0;
}