#include <stdio.h>
int gcd(int n1,int n2,int n3)
{
  int min=0,gcd=0;
  if(n1<n2)
  {
    min=n1;
  }
  else
  {
    min=n2;
  }
  while(min>1)
  {
    if((n1%min==0) && (n2%min==0))
    {
      gcd=min;
      break;
    }
  }
  return gcd;
}
int main() 
{
  int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
  int res=gcd(n1,n2,n3);
  printf("%d",res);
	//Type your code here
	return 0;
}