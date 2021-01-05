#include<iostream>
using namespace std;
int main()
{
  int n,number,i,sum1=0,sum2=0;
  cin>>n;
  if(n<=15){
  for(i=0;i<n;i++){
    cin>>number;
    if(number%2==0)
      sum1=sum1+number;
    else
      sum2=sum2+number;
  }}
  cout<<"The sum of the even numbers in the array is "<<sum1<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<sum2;
    
  }
  //Type your code here.