// PolyMorphism Is single inheritence
#include<iostream>
using namespace std;
class Shape{
	 public:
  	Shape() 
	  {
  		cout<<"Shape constructor ...\n";
	}
  
   //virtual float cal_area() { ... }  //virtual function 
   virtual float cal_area()=0; // pure virtual function => class will be abstract class
                               //contract
   void fun()                            
   {
   	  cout<<"base inside fun() \n";
   }
   virtual ~Shape(){
  	cout<<"Shape destructor ....\n";
  }
};

class circle:public Shape{
 public:
 	circle()
 	{
 		cout<<"circle constructor ...\n";
	}
 float cal_area()
 {
     cout<<"circle cal_area() is called\n";
 }
 ~circle()
 {
  	cout<<"circle destructor...\n";
 }
};






class traingle:public Shape{
 public:
 float cal_area()
 {
     cout<<"traingle cal_area() is called\n";
 }
};

class square:public Shape{
 public:
 float cal_area()
 {
     cout<<"square cal_area() is called\n";
 }
};

int main()
{
 // Shape s; //error: because pure virtual funciton in shape class
  Shape *obj[5];
  int i;
  obj[0]=new circle();
  obj[1]=new square();
  obj[2]=new square();
  obj[3]=new circle();
  
  for(i=0;i<=3;i++)
    obj[i]->cal_area();
  
  /*
  Shape *obj=new circle();
  obj->cal_area();
  
  obj = new square();
  
  obj->cal_area();
  
  obj=new Shape(); //error in case of Shape has one or more pure virtual functions
  
  obj->cal_area();
  */
//  delete obj;
  return 0;
}

// ***  Base class pointer can hold address of derived class 
  //  object ***
  
 // Base class
 // Abstract base class       
 // Pure Virtual Abstract base class  => pure contract

 //__________________________________________________________ 
 
 
  

