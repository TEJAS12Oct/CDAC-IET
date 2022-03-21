//display all prime number upto enter tthe number

#include <stdio.h> 

int main() {
  int n, i, j, c;
  printf("Enter any number :");
  scanf("%d", &n);
  printf("Prime Numbers are: \n");
  
  for(i=1; i<=n; i++)
    {
        c=0;
        for(j=1; j<=n; j++)
        {
            if(i%j==0)
                c++;
        }
        if(c==2)
            printf("%d " ,i);
    }
    return 0;
}