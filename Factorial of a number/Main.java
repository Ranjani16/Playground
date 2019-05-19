#include <stdio.h>
int main() 
{
  int n,prod,i;
  scanf("%d",&n);
  prod=1;
  for( i=1;i<=n;i++)
  {
    prod=prod*i;
  }
  printf("%d",prod);
  
	//Type your code
	return 0;
}