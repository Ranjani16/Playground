#include<stdio.h>
int pwr(int b,int e)
{
  int pow=1;
  while(e>=1)
  {
  pow=pow*b;
  e--;
  }
  return pow;
}
    
  
int main()
{
  int base,exp;
  scanf("%d%d",&base,&exp);
  int res=pwr(base,exp);
  printf("%d",res);
    // Type your code here
  	return 0;
}