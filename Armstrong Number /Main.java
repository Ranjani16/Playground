#include <stdio.h>
#include<math.h>
int main() 
{
  int n,temp,digit=0,remainder,sum=0;
  scanf("%d",&n);
  temp=n;
  while(temp!=0)
  {
    digit++;
    temp=temp/10;
  }
  temp=n;
  while(temp!=0)
  {
    remainder=temp%10;
    sum=sum + pow(remainder,digit);
    temp=temp/10;
  }
  if(n==sum)
  {
    printf("Armstrong Number");
  }
    else
    {
      printf("Not an Armstrong Number");
    }
    
	//Type your code
	return 0;
}