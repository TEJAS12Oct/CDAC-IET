#include<stdio.h>
#include<unistd.h>

void main()
{
	fork();
	fork();
	fork();
	printf("Hi my pid =%d, my ppid =%d \n", getpid(),getppid());
}
