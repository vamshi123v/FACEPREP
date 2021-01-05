#include<iostream>
using namespace std;
int main()
{
  int n,i,meera,temp;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++){
    cin>>a[i];
  }
  cin>>meera;
  for(i=0;i<n;i++){
    if(a[i]==meera){
      cout<<"She passed her exam";
      temp=1;
      break;
    }
    else
      continue;
  }
  if(temp!=1)
    cout<<"She failed";
}