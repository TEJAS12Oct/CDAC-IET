#include<iostream>
using namespace std;
class Complex
{
	int img;
	int real;
	
	public:
	Complex()
	{
	 img=0;
	 real=0;	
	}
	
	Complex(int i,int j)
	{
	 img=i;
	 real=j;	
	}
	 void display ()
	  {
	    	cout<<real<<"+"<<img<<"i";
			   cout<<"\n";  // insertion <<  exsertion >>
	  }
   void set_value(int a) //mutator 
   {
   	 real=a;
   }
	    
  Complex operator+ (Complex ob) // operator overloading
	{
	 	 Complex o; // ham kuch bhi operation kr sakte he isliye java ne nikal diya 
		  		  o.real=this->real+ob.real;
		  		  o.img=this->img+ob.img;
	   		  return o;
	}
};

int main()
{
	Complex obj1(4,5);
	obj1.display();
	Complex obj2(obj1);
	cout<<"2nd Object : ";
	obj2.display();
	
	Complex obj3;
	obj3=obj1;
	cout<<"3 OBJECT : ";
	obj3.display();
	obj3.set_value(7);
	cout<<"AFTER SET OBJECT VALUE : ";
	obj3.display();
	Complex obj4;
	obj4=obj3 + obj2;
	obj4.display();
	
	
}