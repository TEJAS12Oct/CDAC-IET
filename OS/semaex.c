#include<stdio.h>
#include<semaphore.h>
#include<unistd.h>
#include<pthread.h>
int x=100;
sem_t mutex;
void increment()
{  
	int y=0;   
   
       while(y++ < 5){
       sem_wait(&mutex);
	x+=10;
      sem_post(&mutex);
       printf("\nx=%d",x);
       sleep(2);
      }
}

void decrement()
{
        int y=0;
       while(y++<5){
       sem_wait(&mutex); //wait
	x-=5;
        sem_post(&mutex);  //signal
       printf("\nx=%d",x);
       //sleep(1);
       }
}

void main()
{
	pthread_t inc,dec;
       
        sem_init(&mutex,0,1);
        pthread_create(&inc,NULL,(void *)increment,NULL);
        pthread_create(&dec,NULL,(void *)decrement,NULL);

        pthread_join(inc,NULL);
        pthread_join(dec,NULL);
        printf("\nmain ends");
        sem_destroy(&mutex);

       
}
