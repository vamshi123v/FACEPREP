#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  int i;
  char str[10][20];
  for(i=0;i<10;i++){
    cin.getline(str[i],sizeof(str[i]));
 } 
  cout<<str[0]<<"\n";
  for(i=0;i<10;i++){
    if(str[i][strlen(str[i])-1]==str[i+1][0])
      cout<<str[i+1]<<"\n";
    else
     break;
  //Type your code here.
}
}