#include<iostream>
using namespace std;
void swap_by_value(int,int);
void swap_by_add(int*,int *);
void swap_by_reference(int& , int &);
int main()
{
	int num1=10,num2=20;
	swap_by_value(num1,num2);
	cout<<"Swapping by value : Num1 : "<<num1<<"Num2 : "<<num2<<"\n";
	swap_by_add(&num1,&num2);
	cout<<"Swapping by Address : Num1 : "<<num1<<"Num2: "<<num2<<"\n";
	swap_by_reference(num1,num2);
	cout<<"Swapping by  reference : Num1 : "<<num1<<"Num2 : "<<num2<<"\n";
}

void swap_by_reference(int &n1,int &n2)
{
	int temp=n1;
	n1=n2;
	n2=temp;
}
void swap_by_add(int *n1,int *n2)
{
	int temp=*n1;
	*n1=*n2;
	*n2=temp;
}
void swap_by_value(int n1,int n2)
{
 	 int temp=n1;
	  n1=n2;
	  n2=temp;	
}

