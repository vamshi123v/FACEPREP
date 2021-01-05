#include<iostream>
using namespace std;
int main()
{
  int n,i,loc;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  cout<<"Enter the elements in the array"<<"\n";
  int a[n];
  for(i=0;i<n;i++){
     cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element"<<"\n";
  cin>>loc;
  if(loc<n){
  int b[loc],c[n-(loc-1)];
  for(i=0;i<loc-1;i++){
    b[i]=a[i];
  //Type your code here.
}
  cout<<"Enter the value to insert"<<"\n";
  int value;
  cin>>value;
  b[loc-1]=value;
  for(i=loc;i<n+1;i++){
    static int j=0;
     c[j]=a[i-1];
     j++;
  }
  int arr[n+1];
  for(i=0;i<loc;i++)
    arr[i]=b[i];
  for(i=loc;i<=n+2;i++){
    static int k=0;
    arr[i]=c[k];
    k++;
  }
 cout<<"Array after insertion is"<<"\n";
  for(i=0;i<n+1;i++)
    cout<<arr[i]<<"\n";
  }
  else
    cout<<"Invalid Input";
}