#include<iostream>
using namespace std;
int printresult(int *ptr,int mugs,int cupv){
  int sum=0,i;
  for(i=0;i<mugs;i++){
    cin>>ptr[i];
    sum=sum+ptr[i];
  }
  if(sum>cupv)
    return 1;
  else
    return 0;
}
int main(){
 int mugs,cupv,i;
 cin>>mugs>>cupv;
 int a[mugs];
 int b=printresult(a,mugs,cupv);
 if(b==1)
   cout<<"NO";
 else
   cout<<"YES";
}