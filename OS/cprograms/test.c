#include<stdio.h>
#include<unistd.h>

void main()
{
	printf("Hi I am prachi , the pid=%d , the ppid=%d \n",getpid(),getppid() );
}
