#include<iostream>
using namespace std;
int main()
{
  int price,discount,scharges,fprice,a[2],i;
  for(i=0;i<3;i++)
  {
    cin>>price>>discount>>scharges;
    discount=float(discount)/100*price;
    fprice=price-discount+scharges;
    a[i]=fprice;
  }
  cout<<"In Flipkart Rs."<<a[0]<<"\n";
  cout<<"In Snapdeal Rs."<<a[1]<<"\n";
  cout<<"In Amazon Rs."<<a[2]<<"\n";
  if(a[0]<a[1]&&a[0]<a[2])
    cout<<"He will prefer Flipkart";
  else if(a[1]<a[0]&&a[1]<a[2])
    cout<<"He will prefer Snapdeal";
  else if(a[0]==a[1]&&a[0]<a[2])
    cout<<"He will prefer Flipkart";
  else if(a[0]==a[1]&&a[0]>a[2])
    cout<<"He will prefer Amazon";  
  else
    cout<<"He will prefer Amazon"; 
  
  //Type your code here.
}