// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
void largesr_ele_index(int list[],int size);
// Main function
int main()
{
  int size,list[10],i;
  scanf("%d",&size);
  for(i=0;i<size;i++)
  {
    scanf("%d",&list[i]);
  }
  largest_ele_index(list,size);

  // Type your code here 
  
   return 0;
}
void largest_ele_index(int list[],int size)
{
  int i,large,max_idx;
  large=list[0];
  max_idx=0;
  for(i=1;i<size;i++)
  {
    if(large<list[i])
    {
      max_idx=i;
    }
  }
  printf("%d",max_idx);
}