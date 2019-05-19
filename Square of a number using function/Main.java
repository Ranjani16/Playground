#include<stdio.h>
int sqr(int m)
{
  int s;
  s=m*m;
  return s;
}
int main() 
{
  int n,num;
  scanf("%d",&n);
  num=sqr(n);
  printf("%d",num);
   // Type your code here
   return 0;
}