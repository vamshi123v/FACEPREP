#include<iostream>
using namespace std;
int main()
{
  int a[2],i,num,small;
  for(i=0;i<3;i++)
  {
    cin>>num;
      a[i]=num;
  }
  if(a[0]<a[1]&&a[0]>a[2]||a[0]<a[2]&&a[0]>a[1])
    cout<<"The treasure is in box which has number "<<a[0]<<"\n";
  else if(a[1]<a[2]&&a[1]>a[0]||a[1]<a[0]&&a[1]>a[2])
    cout<<"The treasure is in box which has number "<<a[1]<<"\n";
  else
    cout<<"The treasure is in box which has number "<<a[2]<<"\n";
  if(a[0]<a[1]&&a[0]<a[2])
    small=a[0];
  else if(a[1]<a[0]&&a[1]<a[2])
    small=a[1];
  else
    small=a[2];
  while(true){
  if(a[0]%small==0&&a[1]%small==0&&a[2]%small==0){
    cout<<"The code to open the box is "<<small;
    break;
  }
  else
    small=small-1;
  } 
  }