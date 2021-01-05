#include<iostream>
using namespace std;
int main()
{
  int number,r,i,a[10],code;
  cin>>number;
  i=0;
  while(number!=0)
  {
    r=number%10;
    a[i]=r;
    i++;
    number=number/10;
  }
  code=a[0]+a[3];
  cout<<code;
  
  //Type your code here.
}