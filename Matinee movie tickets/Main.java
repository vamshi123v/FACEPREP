#include<iostream>
using namespace std;
int main()
{
  int age,price;
  float time;
  cin>>age;
  cin>>time;
  if(age>13){
    if(time==13.30f)
      price=5;
    else
      price=8;
    cout<<"$"<<price<<".00";
}
else
{
  if(time==13.30f)
    price=2;
  else
    price=4;
  cout<<"$"<<price<<".00";
}
  
  //Type your code here.
}