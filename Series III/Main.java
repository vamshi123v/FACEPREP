#include<iostream>
using namespace std;
int main()
{
  int temp,n,i,num=6;
  cin>>n;
  for(i=0;i<n;i++){
    temp=num+5*i;
    cout<<temp<<" ";
    num=temp;
  }
}