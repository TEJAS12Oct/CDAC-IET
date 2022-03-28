/*
Q10.Write a function to display prime numbers from 1 to 100. (Form the function on your own give 
relevant name)
*/



#include<stdio.h>
void prime(int n);
int main()
{
	int n; 
    int result;
	prime(n);
	return 0;
}

void prime(int n)
{
	int  i,j,n1;
	printf("enter the  number = ");
	scanf("%d",&n1);
	for(i=1; i<=n1; i++)
    {
        c=0;
        for(j=1; j<=n1; j++)
        {
            if(i%j==0)
                c++;
        }
        if(c==2)
            printf("%d " ,i);
    }
}