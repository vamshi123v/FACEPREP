#include<iostream>
using namespace std;
int main()
{
  int n,i,max,temp;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++){
    cin>>a[i];
  }
  for(i=0;i<n;i++){
    if(i+1!=n){
      if(a[i]>a[i+1]){
        temp=a[i+1];
        a[i+1]=a[i];
        a[i]=temp;
      }
      else
        continue;
  }
  // Type your code here
}
  cout<<a[n-1];
}