#include<iostream>
using namespace std;
int main(){
int encr,num,i,result,sum=0;
cin>>encr>>num;
result=encr+num;
for(i=1;i<result;i++){
  if(result%i==0)
  {
    sum=sum+i;
  }
}
if(result==sum)
  cout<<"They can read the message";
else
  cout<<"They can't read the message";

}
  