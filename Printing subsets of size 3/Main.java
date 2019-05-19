#include<stdio.h>
int main()
{
  int as;
  scanf("%d",&as);
  int a[10];
  for(int i=0;i<=as-1;i++)
  {
    scanf("%d",&a[i]);
  }
  for(int i1=0;i1<=as-2;i1++)
  {
    for(int i2=i1+1;i2<=as-1;i2++)
    {
      for(int i3=i2+1;i3<=as-1;i3++)
      {
        printf("(%d, %d, %d) ",a[i1],a[i2],a[i3]);
      }
    }
    printf("\n");
  }
    
  //Type your code here
  return 0;
}