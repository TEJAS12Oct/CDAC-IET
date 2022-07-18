#include<stdio.h>
#include<unistd.h>

void main()
{
   printf("HI Welcome pid=%d",getpid());
   sleep(3);
   execl("/bin/ls","ls",NULL);
   printf(" Bye pid=%d",getpid());

}
