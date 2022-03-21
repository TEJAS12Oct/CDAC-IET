/*
Q2.Modify above structure book to store 5 book record.Display record of all 
the books using function. 
*/



#include<stdio.h>
#include<stdlib.h>
struct book
{
	int bookid;
	char title[20];
	int price;
};
typedef struct  book  b;

void accept_info(b *b1)
{
	int i;
	printf("Enter the  BookID = \nEnter the  Title =\nEnter the  price = \n");
	for(i=1;i<=5;i++)
	{
		scanf("%d%s%d",&b1[i].bookid,b1[i].title,&b1[i].price);
	}
	
}

void display_info(b *b1)
{
	printf("............Display Information..................\n");
	int i;
	for(i=1;i<=5;++i)
	{
		printf("BookID = %d\tTitle = %s\tprice =%d\n",b1[i].bookid,b1[i].title,b1[i].price);
		
	}
	
}

int main()
{
	b b1[5];
	
	accept_info(b1);
	display_info(b1);
	
	return 0;
}
