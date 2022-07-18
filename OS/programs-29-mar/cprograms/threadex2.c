#include<stdio.h>
#include<unistd.h>
#include<pthread.h>

   pthread_t  th1, th2;

void  editor()
{
      int x=0;


       pthread_join(th2,NULL); //editor pauses for th2 to terminate
       while(x++ < 5)
       {
		printf("editor runs thid = %ld \n",pthread_self());
		sleep(2);
       }
	
}
void spellchecker()
{
      int x =0;
      while(x++ < 5)
       {
		printf("spellchecker runs thid = %ld \n",pthread_self());
		sleep(2);
       }
}


void main()
{
     
    //multi thread model 
    pthread_create(&th1,NULL,(void*)editor,NULL);
    pthread_create(&th2,NULL,(void*)spellchecker,NULL);

   pthread_join(th1,NULL);  //main will pause till th1 is not done

   printf("\nmain thread id = %ld running th1=%ld,th2=%ld \n ",pthread_self(),th1,th2);
}//end of main













