#include<iostream>
using namespace std;
int main(){
  int num1,num2,sum=0,i,j;
  cin>>num1>>num2;
  for(i=num1;i<=num2;i++){
    for(j=1;j<i;j++){
      if(i%j==0)
        sum=sum+j;
    }
    if(sum==i)
      cout<<i<<" ";
    sum=0;    
  }
}