#include <stdio.h>
int main() 
{
  int n;
  scanf("%d",&n);
  int val=n;
  for(int i=1;i<=n;i++)
  {
    for(int j=val;j>=1;j--)
    {
      printf("%d",j);
    }
    val--;
    printf("\n");
  }
    // Type your code here
	return 0;
}