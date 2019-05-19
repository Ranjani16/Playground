#include<stdio.h>
int snn(int m)
{
  int s=0;
  for(int i=1;i<=m;i++)
  {
    s=s+i;
  }
  return s;
}
int main() 
{
  int n,sum;
  scanf("%d",&n);
  sum=snn(n);
  printf("%d",sum);
    // Type your code here
  	return 0;
}