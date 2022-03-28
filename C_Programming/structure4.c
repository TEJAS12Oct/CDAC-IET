#include<stdio.h>
#include<math.h>
typedef struct circle
{
	int x;
	int y;
	int rad;
}stu;
void accept(stu *c1)
{
 printf("enter x ,y and radius :\n");
 scanf("%d%d%d",&c1->x,&c1->y,&c1->rad);
}
void display(stu c1)
{
	printf("circle data: \n");
	printf("X:%d \nY:%d \nradius:%d\n",c1.x,c1.y,c1.rad);
}
int check_intersection(stu c1,stu c2)
{
	int c1c2=0;
	
	int a=(c2.x*c2.x)+(c1.x * c1.x)-(2*(c2.x*c1.x)),b=(c2.y*c2.y)+(c1.y * c1.y)-(2*(c2.y*c1.y));
	c1c2=sqrt(a+b);

return c1c2;

	
}
void check(int c1c2,stu c1,stu c2)
{
	int rad_total=c1.rad+c2.rad;
	printf("\nrad_total = %d\n",rad_total);
	if(c1c2<rad_total)
	{
		printf("\nc1c2<rad_total = CIRCLE INTERSECT\n");
	}
    else if(c1c2>rad_total)
    {
        printf("\nc1c2>rad_total = NOT INTERSECT");
    }
    else
    printf("\n c1c2 = circle touch \n");
}
int main()
{
	stu c1,c2;
	accept(&c1);
	display(c1);
	accept(&c2);
	display(c2);
    int res=check_intersection(c1,c2);
	printf("\nc1c2=%d\n",res);
    check(res,c1,c2);
	return 0;
}