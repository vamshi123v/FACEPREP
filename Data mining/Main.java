#include<iostream>
using namespace std;
int main()
{
  int num,temp,rem,sum1=0,sum2=0;
  cin>>num;
  temp=num;
  while(temp!=0)
  {
    rem=temp%10;
    if(rem%2==0)
      sum1=sum1+rem;
    else
      sum2=sum2+rem;
    temp=temp/10;
  }
  if(sum1==sum2)
    cout<<"Yes";
  else
    cout<<"No";
  
    
    
  //Type your code here.
}