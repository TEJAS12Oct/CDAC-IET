#include<iostream>
using namespace std;
class Array{
  int *arr;
  int size;

  public:

  Array() { arr=NULL; }

  Array(int s)
  {
    size=s;
    arr=new int[size];
  }
  void accept_values()
  {
    int i;
    cout<<"Enter "<<size<<" numbers : \n";
    for(i=0;i<size;i++)
      cin>>arr[i];
  }
  void set_ele(int n_ele,int pos)
  {
     arr[pos]=n_ele;
  } 

  void display()
  {
    int i;
    for(i=0;i<size;i++)
       cout<<arr[i]<<"  ";

    cout<<"\n";
  }
  
  ~Array()
  {
  	delete []arr;
  	cout<<"Destructor";
  }
  
  Array(Array &o)
  {
  	size=o.size;
  	arr=new int[size];
  	for(int i=0;i<size;i++)
	    arr[i]=o.arr[i];
	   
	cout<<"\nCopy constructor";    
  	
  }
  
  void operator=(const Array &o)
  {
  	delete []arr;
  	size=o.size;
  	arr=new int[size];
  	for(int i=0;i<size;i++)
	    arr[i]=o.arr[i];
	  
	cout<<"\nassignment operator";    
  } 
  
  
};


int main()
{
   Array obj(5);
   Array obj3(2);
   obj.accept_values();   //{3,4,5,6,8}
   obj.display();
   Array obj2(obj);
   obj2.display();
 

   obj3=obj;   //obj3.operator=(obj)
   obj3.display();
   obj3.set_ele(500,3);
   obj3.display();

   obj.display();
   obj2.display();
   return 0;
}





