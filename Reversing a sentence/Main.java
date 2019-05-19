#include<stdio.h>
#include<string.h>
#define MAX_SIZE 100

int main()
{
  char str[100],rev[100];
  int len,i,idx,ws,we;
  gets(str);
  len=strlen(str);
  idx=0;
  ws=len-1;
  we=len-1;
  while(ws>0)
  {
    if(str[ws]==' ')
    {
      i=ws+1;
      while(i<=we)
      {
        rev[idx]=str[i];
        i++;
        idx++;
      }
      rev[idx++]=' ';
      we=ws-1;
    }
    ws--;
  }
  for(i=0;i<=we;i++)
  {
    rev[idx]=str[i];
    idx++;
  }
  rev[idx]='\0';
  printf("%s",rev);
  
  // Type your code here
  return 0;
}