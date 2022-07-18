#include<stdio.h>
#include<unistd.h>

void main()
{
	fork();
	printf("Hi my pid =%d, my ppid =%d \n", getpid(),getppid());
}
