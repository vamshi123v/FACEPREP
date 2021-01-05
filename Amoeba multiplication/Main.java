#include<iostream>
using namespace std;
int main()
{
  int month,a,b,i,fib;
  cin>>month;
  a=0;
  b=1;
  int k[month];
  for(i=0;i<month;i++){
    k[i]=a;
    fib=a+b;
    a=b;
    b=fib;
  }
  cout<<k[month-1];
    
  //Type your code here.
}