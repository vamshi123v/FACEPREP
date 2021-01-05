#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i;
  cin.getline(str,100);
  for(i=0;i<100;i++)
  { 
    if(str[i]=='\0')
      break;
    else
      count++;
      continue;
  }
  for(i=count-1;i>=0;i--){
     static int j=0;
     rev[j]=str[i];
    j++;
  }
    //Your code goes here               
std::cout<<rev;
}