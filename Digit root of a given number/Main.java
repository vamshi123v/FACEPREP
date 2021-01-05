#include<iostream>
using namespace std;
int main(){
int n,temp,result,rem,sum=0,count=0;
cin>>n;
temp=n;
while(true){
    while(n!=0){
    rem=n%10;
    sum=sum+rem;
    n=n/10;
    }
    result=sum;
    while(sum!=0){
    sum=sum/10;
  count++;
    }
    if(count==1){
      cout<<result;
      break;
    }
    else{
      n=result;
      count=0;
      continue;
}
}
}
    