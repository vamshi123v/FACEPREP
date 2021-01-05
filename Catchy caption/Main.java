
#include <iostream>
#include<cstring>
using namespace std;
int main()
{
  char inp[100];
  int i,count=0;
  cin.getline(inp,sizeof(inp));
  //cout<<strlen(inp);
  for(i=0;i<strlen(inp);i++){
    if(inp[i]==' ')
      count++;
    
  }
  if(count<9)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
   //Your code goes here
   
}