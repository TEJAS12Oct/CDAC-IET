#include<iostream>
using namespace std;

class Base
{
	int a,b,c;
	public:
		Base()
  		{
  		 cout<<"Base Constructor \n";
  	    }
	   
	 virtual  void fun()
	    {
   	 	  cout<<"Base fun() called \n";
		}
	 	
		 ~Base()
   		{
   		  cout<<"Base destructor called\n";	
   	    }		    
};
class B1:virtual public Base
{
	public:
	B1()
	{
		cout<<"B1 ctor called \n";
	}
	
	~B1()
	{
		cout<<"B1 Dtor called \n";
	}
	
	void fun()
 	{
        cout<<"B1 fun() called \n";
	}
	
};
class B2: virtual public Base
{
	public:
	B2()
	{
		cout<<"B2 ctor called \n";
	}
	
	~B2()
	{
		cout<<"B2 Dtor called \n";
	}
	
	void fun()
 	{
        cout<<"B2 fun() called \n";
	}
	
};
class Derived:public B1,public B2
{
	public:
	void fun()
 	{
        cout<<"Derived fun() called \n";
	}
		Derived()
	 	{
		 cout<<"Derived Ctor \n ";				 	
		}
		
		~Derived()
	 	{
		 cout<<"Derived Dtor \n ";				 	
		}
};

int main()
{
	Base *obj=new Derived();
	obj->fun(); // to called child class method means derived so we have to make method as a virtual
	Derived d;
	d.B1::fun();
	d.B2::fun();
	
	delete obj;


//cout<<"Size of base :"<<sizeof(Base)<<" Size of B1 "<<sizeof(B1)<<"size of B2 :  "<<sizeof(B2)<<"Size of Derived :  "<<sizeof(Derived);
	
	
	
}