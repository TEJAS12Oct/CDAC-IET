#include<iostream>
using namespace std;
class MyDate
{
	int d,m,y;
	public:
	MyDate(int d,int m,int y)
	{
		this->d=d;
  		this->m=m;
		  this->y=y;
		}
		void display()
		{
		 	cout<<"Date: "<<this->d<<"-"<<this->m<<"-"<<this->y<<"\n";
			}	
};
class Book
{
	int bookNo;
	int ISBN_No;
	string title;
	string publisherName;
	MyDate dop;
	public:
		Book(int no,int isbn,string title,string name,int d,int m,int y) :dop(d,m,y)// initilizer list
	 {
			this->bookNo=no;
			this->ISBN_No=isbn;
			this->title=title;
			this->publisherName=name;
		//	this->dop=dop;	  					 	
	 }
  	 ~Book()
   {
		    	cout<<"DTOR OF BOOK \n ";
	}
	virtual void display()
	{
		cout<<"BOOK NO : "<<bookNo<<"\nISBN NO : "<<ISBN_No<<"\n";
		cout<<"Title : "<<title<<"\n";
	 	cout<<"Publisher : "<<publisherName<<"\n";
		 dop.display();				 
	}
};
class TestBook : public Book
{
	string firstAuthor;
	public :
	TestBook(int no,int isbn,string title,string publisher,string name,int d,int m,int y):Book(no,isbn,title,publisher,d,m,y) // base initlizer list
	{
		this->firstAuthor=name;
		cout<<"CTOR OF TESTBOOK \n"; 
	}
	~TestBook()
	{
		cout<<"DTOR OF TESTBOOK \n";
	}
	void display()
	{	
		this->Book::display();
		cout<<"First Author : "<<this->firstAuthor<<" \n";
	}
};
class Edited_Book :public Book
{
  string ediotr_Name;
  int No_of_article;
  
  public:	
	Edited_Book(int no,int isbn,string title,string publisher,string name,int number,int d,int m,int y):Book(no,isbn,title,publisher,d,m,y)
	{
		this->ediotr_Name=name;
		this->No_of_article=number;	
		cout<<"EDBOOK"<<"\n";			 
	}
	
	~Edited_Book()
	{
		cout<<"DTOR ED \n";
	}
 	void display()
 	{
 		this->Book::display(); 
		 cout<<"ED NAME : "<<this->ediotr_Name<<" \n";
   		 cout<<"NO OF ARTICLES : "<<this->No_of_article<<"\n";
	 }
		
};

int main()
{
	Book *obj=new TestBook(1,2,"CPP","AA","bb",12,4,2023);
		 obj->display();	
}