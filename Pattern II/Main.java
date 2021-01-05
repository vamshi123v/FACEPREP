#include<iostream>
using namespace std;
int main()
{
  int n,i,j,v=1,a,temp,count=0;
  cin>>n;
  for(i=1;i<=n;i++){
    if(i%2!=0){
    for(j=1;j<=i;j++){
     cout<<v;
      v++;
      if(i>1&&j<i)
        cout<<"*";
      temp=v-1;;
    }
      cout<<"\n";
    }
    else{
       a=temp+i;
     for(j=a;j>=temp+1;j--){
     cout<<j;
     if(j>temp+1)
       cout<<"*";
     }
      cout<<"\n";
    v=a+1;
     }
    
     }
}