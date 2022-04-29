#include<iostream>
int a=20;
namespace Na
{
	int a=30;
}
int main()
{
	int a=10;
	char name[20];
	std::cout<<"NUMBER : "<<a<<"\n";
	std::cout<<"NUM: "<<::a<<"\n";
	
	std::cout<<"NUMBER : "<<Na::a<<"\n";
	std::cout<<"Name: "<<"\n";
	std::cin>>name;
	std::cout<<" NAME : "<<name<<"\n";

	
	
}