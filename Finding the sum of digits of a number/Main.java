#include <stdio.h>
int main() 
{
  int n,digit,sum;
  scanf("%d",&n);
  sum=0;
  while(n!=0)
  {
    digit=n%10;
    n=n/10;
    sum=sum+digit;
  }
  printf("%d",sum);
	//Type your code
	return 0;
}