/*
Q1.define a structure Book having members bookId,title,price. 
Accept the data for a book and display the record. 
pass structure to function and accept and display information for one book.
*/


#include<stdio.h>
#include<math.h>
struct book
{
	int bookid;
	char title[10];
	int price;
};
typedef struct  book  b;

void accept_info(b *b1)
{
	printf("Enter the  BookID = ");
	scanf("%d",&b1->bookid);
	
	printf("Enter the  Title = ");
	scanf("%s",b1->title);
	
	printf("Enter the  price = ");
	scanf("%d",&b1->price);
}

void display_info(b b1)
{
	printf("............Display Information..................\n");
	printf("BookID = %d\nTitle = %s\nprice =%d\n",b1.bookid,b1.title,b1.price);
}

int main()
{
	b b1;
	
	accept_info(&b1);
	display_info(b1);
	
	return 0;
}
