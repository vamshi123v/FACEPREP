#include<iostream>
using namespace std;
int func(int n,int *arr)
{
  int i,odd=0,even=0;
  for(i=0;i<n;i++){
    if(arr[i]%2==0)
      even++;
    else
      odd++;
  }
  if(even>0 && odd<1)
    return 1;
  else if(odd>0 && even<1)
    return 2;
  else
    return 3;
}
int main()
{
  int n,arr[20],i,result;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  cout<<"Enter the elements in the array"<<"\n";
  for(i=0;i<n;i++)
     cin>>arr[i];
  result=func(n,arr);
  if(result==1)
    cout<<"The array is Even";
  else if(result==2)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
  
  //Type your code here.
}