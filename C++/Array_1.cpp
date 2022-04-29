#include<iostream>
using namespace std;
class Array
{
	int *arr;
	int size;
	public :
	Array()
	{
		arr=NULL;
	}
	Array(int s)
	{
		size=s;
  		arr=new int[size];
	}
	Array(Array &o)
	{
		size=o.size;
		arr=new int [size];
		for(int i=0;i<size;i++)
		arr[i]=o.arr[i];
		
		cout<<"\n Copy Constructor";
	}
	void set_ele(int n_ele,int pos)
	{
		arr[pos]=n_ele;
	}
	void accept_ele()
	{
		for(int i=0;i<size;i++)
			{
 			 	cout<<"Enter"<<i<<"numbers  : ";	   	
 				 cin>>arr[i];
			}	
			
										  		
	}
	void operator=(const Array &o)
	{
               delete [] arr;
			   size=o.size;
			   arr=new int [size];
			   for(int i=0;i<size;i++)
			   arr[i]=o.arr[i];    
	}
	void display()
	{
		for(int i=0;i<size;i++)
				{
				   cout<<arr[i]<<" ";			   						
				}
  				cout<<"\n";
	}
	Array operator+ (Array obj)
	{
		Array temp(5);
		for(int i=0;i<size;i++)
		{
		  temp.arr[i]=this->arr[i]+obj.arr[i];
		  		
		  }
		     return temp;
	}
	
};
int main()
{
	Array obj(5);
	obj.accept_ele();
	obj.display();
	Array obj2(obj);
	obj2.display();
	
	Array obj3(5);
	obj3=obj;
	obj3.set_ele(500,3);
	cout<<"OBJECT 3";
	obj3.display();
	cout<<"OBJECT 1";
	obj.display();
	cout<<"OBJECT 2";
	obj2.display();
	cout<<"ADDITION ON OBJECT 3 = OBJECT 1+2";
	obj3=obj + obj2; // obj.operator+(obj2);
	obj3.display();
	obj.display();
	
	
}