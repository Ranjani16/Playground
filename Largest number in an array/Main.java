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
  int max;
  if(a[0]>a[1])
  {
    max=a[0];
  }
  else
  {
    max=a[1];
  }
  for(int i=2;i<=as-1;i++)
  {
    if(max<a[i])
    {
      max=a[i];
    }
  }
  printf("%d",max);
  //fill the code
  return 0;
}