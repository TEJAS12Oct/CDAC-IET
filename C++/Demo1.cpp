#include<iostream>
using namespace std;

void swap_val(int,int);
void swap_add(int *,int *);
void swap_ref(int &,int &);

int main()
{
   int num1=10, num2=20;
   
   swap_val(num1,num2);
   cout<<"After swap by value num1 = "<<num1<<" num2 = "<<num2 <<"\n";   // not swapped

   swap_add(&num1,&num2);
   cout<<"After swap by address num1 = "<<num1<<" num2 = "<<num2<<"\n";  //swapped

   swap_ref(num1,num2);
   cout<<"After swap by reference num1 = "<<num1<<" num2 = "<<num2;  //swapped
   return 0;
}

void swap_val(int n1,int n2)
{
  int temp;
  temp=n1;
  n1=n2;
  n2=temp;
}
 
void swap_add(int *n1,int *n2)
{
  int temp;
  temp= *n1;
  *n1=*n2;
  *n2=temp;
}

void swap_ref(int &n1,int &n2) //int &n1=num1
{
  int temp;
  temp=n1;
  n1=n2;
  n2=temp;
}


/*After swap by value num1 = 10 num2 = 20
After swap by address num1 = 20 num2 = 10
After swap by reference num1 = 10 num2 = 20
--------------------------------
Process exited after 0.1258 seconds with return value 0
Press any key to continue . . .
*/
