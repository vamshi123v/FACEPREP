#include<iostream>
using namespace std;
int main()
{
  int p,t,r,si,amount;
  float total,discount;
  
  cin>>p;
  cin>>r;
  cin>>t;
  si=p*t*r/100;
  amount=p+si;
  discount=2.0/100*si;
  total=amount-discount;
  cout<<si<<"\n";
  cout<<amount<<"\n";
  cout<<discount<<"\n";
  cout<<total<<"\n";
  //Type your code here.
}