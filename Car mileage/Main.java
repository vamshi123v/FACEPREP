#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int petrol,distance;
  cin>>mileage;
  cin>>petrol;
  cin>>distance;
  if(distance/mileage<=petrol)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  //Type your code here.
}