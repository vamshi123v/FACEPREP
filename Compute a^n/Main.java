#include<iostream>
using namespace std;
int pow(int a,int b)
{
  if(b<1)
    return 1;
  else
    return a*pow(a,b-1);
}
int main()
{
  int a,n;
  cout<<"Enter the value of a"<<"\n";
  cin>>a;
  cout<<"Enter the value of n"<<"\n";
  cin>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<pow(a,n);
  //Type your code here.
}