#include<iostream>
using namespace std;
int main()
{
  int n,i,j,count=1;
  cin>>n;
  for(i=1;i<=n;i++){
    for(j=0;j<i;j++){
     cout<<i;
      if(count<i)
        cout<<"*";
       count++;
    }
    cout<<"\n";
    count=1;
  //Type your code here.
}
  for(i=n;i>0;i--){
    for(j=0;j<i;j++){
      cout<<i;
      if(j!=i-1)
        cout<<"*";
    }
    cout<<"\n";
}
}