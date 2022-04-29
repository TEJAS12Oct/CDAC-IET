#include<iostream>
using namespace std;

 class Base{
	public:
		Base()
		{
			cout<<"Base constructor \n";
		}
		
		
		void fun()
		{
			cout<<"fun() base class \n";
		}
};

class B1:public virtual Base{
	public:
	B1()
	{
		cout<<"B1 constructor \n";
	}
	void fun()
	{
		cout<<"fun() B1 class \n";
	}
	
};

class B2: virtual public Base{
	public:
	B2()
	{
		cout<<"B2 constructor \n";
	}
	void fun()
	{
		cout<<"fun() B2 class \n";
	}
	
};

class derived : public B1,public B2 {
	public:
	void fun()
	{
		B1::fun();
	}
	derived()
	{
			cout<<"derived constructor \n";
	}
};

int main()
{
	derived obj;
	obj.fun();
	return 0;
}
