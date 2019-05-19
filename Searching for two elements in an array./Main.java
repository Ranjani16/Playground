#include<stdio.h>
int main()
{
  int arr_size;
  scanf("%d",&arr_size);
  int arr[10];
  for(int i=0;i<=arr_size-1;i++)
  {
    scanf("%d",&arr[i]);
  }
  int search_1;
  scanf("%d",&search_1);
  int search_2;
  scanf("%d",&search_2);
  int ele_1 = -1;
  int ele_2 = -1;
  for(int i=0;i<=arr_size-1;i++)
  {
    if(search_1==arr[i])
    {
      ele_1=i;
    }
    if(search_2==arr[i])
    {
      ele_2=i;
    }
  }
  printf("%d\n",ele_1);
  printf("%d\n",ele_2);
  
  //Type your code here
  return 0;
}