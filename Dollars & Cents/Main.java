#include<iostream>
using namespace std;
int main()
{
  int i,dollar,cent,dollarsum=0,centsum=0;
  for(i=0;i<2;i++)
  {
    cin>>dollar>>cent;
    dollarsum=dollarsum+dollar;
    centsum=centsum+cent;
  }
  if(centsum>100){
    centsum=centsum-100;
    dollarsum=dollarsum+1;
    cout<<dollarsum<<"\n";
    cout<<centsum;
}
 else{
   cout<<dollarsum<<"\n";
    cout<<centsum;
 }
   //Type your code here.
}