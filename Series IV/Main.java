#include<iostream>
using namespace std;
int main()
{
  int n,i,num=-2,j,temp=2,result,count=0;
  cin>>n;
  for(i=0;i<n;i++){
    for(j=0;j<2;j++){
      result=num+temp;
      count++;
      cout<<result<<" ";
      num=result;
      if(count==n)
        break;
    }
 
    temp=temp+4;
    if(count==n)
      break;
  } 
    
  //Type your code here.
}