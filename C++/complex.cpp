#include<iostream>
using namespace std;
class complex{
      int real;
      int imag;
   public:
       complex() { real=0; imag=0;}
       complex(int i, int j) { real = i; imag=j;}
     
       void set_real(int i)
       {
       	 real=i;
	   }
       complex operator+(complex c)
       {
          complex temp;
          temp.real=real+c.real;
          temp.imag=imag+c.imag;
          return temp; 

       }

       void display()     // void display(complex *this,int a)
       {
       
          cout<<this->real<<" + "<<this->imag<< "i\n";
       }

   }; //end of class
   

   int main()
   {
     complex c1(4,5), c2(2,3);
     complex c3;

     c1.display();      //display(complex &c1,i)
     c2.display();
     
     c2=c1;
     c2.display();
	  
     c3 = c1 + c2; //   c3 = c1.operator+(c2)
     c3.display();
     
     c1.set_real(7);
     complex c4(c2);
     
	 c1.display();
	 c4.display();
	 
	 return 0;    
   }
   
/*
4 + 5i
2 + 3i
4 + 5i
8 + 10i
7 + 5i
4 + 5i

--------------------------------
Process exited after 0.1544 seconds with return value 0
Press any key to continue . . .
*/
