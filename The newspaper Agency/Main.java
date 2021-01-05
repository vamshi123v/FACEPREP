#include<iostream>
using namespace std;
int main()
{
  int w,x,y,sell,profit,cost,misc=100;
  cin>>w;
  cin>>x;
  cin>>y;
  cost=w*y;
  sell=w*x;
  profit=sell-cost-misc;
  cout<<profit;
  //Type your code here.
}