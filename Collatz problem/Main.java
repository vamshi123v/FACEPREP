#include<iostream>
using namespace std;
int main()
{
  int n,count=0;
  cin>>n;
  while(n!=1)
  {
    cout<<n<<"\n";
    if(n%2!=0)
      n=3*n+1;
    else
      n=n/2;
    count++;
  }
  cout<<1<<"\n";
  cout<<count;
    
  //Type your code here.
}