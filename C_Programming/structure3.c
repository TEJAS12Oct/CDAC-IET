// circle intersects


#include <stdio.h>
#include<math.h>

struct Circle
{
   int x;
   int y;
   int rad;
};

void set_values(struct Circle *c)
{
	
	printf("Enter x , y and radius = \n");
	scanf("%d%d%d",&c->x,&c->y,&c->rad);
}

void print_circle(struct Circle c)
{
	printf("x=%d\ny=%d\nrad=%d\n",c.x,c.y,c.rad);
}


int intersect(struct Circle c1,struct Circle c2)
{
	int c1c2=0;
	
	int a=(c2.x*c2.x)+(c1.x * c1.x)-(2*(c2.x*c1.x));
	int b=(c2.y*c2.y)+(c1.y * c1.y)-(2*(c2.y*c1.y));
	c1c2=sqrt(a+b);

    return c1c2;

}
	
void check(int c1c2,struct Circle c1,struct Circle c2)
{    
	
	int rad_total=c1.rad+c2.rad;
	printf("\nrad_total = %d\n",rad_total);
	if(c1c2<rad_total)
	{
		printf("\nc1c2<rad_total = CIRCLE INTERSECT\n");
	}
    else if(c1c2>rad_total)
    {
        printf("\nc1c2>rad_total = NOT INTERSECT\n");
    }
    else
    printf("\nc1c2 == circle touch\n");
}


int main()
{
   struct Circle c1, c2;
   
   set_values(&c1);
   print_circle(c1);
   
   set_values(&c2);
   print_circle(c2); 

   int res =intersect(c1, c2);
   printf("\nc1c2=%d\n",res);
   
   check(res,c1,c2);
   return 0;
}




