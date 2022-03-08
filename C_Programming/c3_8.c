/*
Q8.Write a Menu driven program for following options
1. Add
2. Substract
3. Multiply
4. Divide
5. Exit.
For doing Addition,subtraction,multiplication,division write separate functions as follows.
void add(int n1,int n2)
void sub(int n1,int n2)
int mult(int n1,int n2)
int div(int n1,int n2)
*/

#include<stdio.h>
void add(int n1,int n2);
void sub(int n1,int n2);
int mul(int n1,int n2);
int div(int n1,int n2);
int main()
{

    int n1,n2; 
    int result,choice;
	
	printf("enter the two number = ");
	scanf("%d%d",&n1,&n2);
   
	do{
	printf("\n0.exit\n1.add\n2.sub\n3.mul\n4.div");
	printf("\nEnter your Choice = ");
	scanf("%d",&choice);
	
	
	
    if(choice==1) {
		add(n1,n2);
		}  
    
	else if(choice==2){
	sub(n1,n2);}  
    
	else if(choice==3){
	result = mul(n1,n2);  
    printf("mul = %d\n",result);
	}
	
	else if(choice==4){
    result = div(n1,n2);  
    printf("div = %d\n",result);
	}	
	else{
		printf("Invalid");
	}
	return 0;
	}while(0);
}
 
void add(int n1 , int n2)
{       
        int result; 
        result = n1 + n2;
		printf("add = %d\n",result);
            
}

void sub(int n1 , int n2)
{       
        int result; 
        result = n1- n2;
        printf("sub = %d\n",result);    
}

int mul(int n1 , int n2)
{       
        int result; 
        result = n1 * n2;
        return result;    
}



int div(int n1 , int n2)
{       
        int result; 
        result = n1 / n2;
        return result;    
}




