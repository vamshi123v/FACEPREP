#include<iostream>
using namespace std;
int main()
{
  int a,b,small,gcd,i;
  cin>>a>>b;
  if(a<b)
    small=a;
  else
    small=b;
  for(i=1;i<=small;i++){
    if(a%i==0 && b%i==0){
      gcd=i;
  }
  }
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd;
  
  //Type your code here.
}