#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a=3,b=4,x,y,dist,hops;
  float distance;
  cin>>x;
  cin>>y;
  dist=(x-a)*(x-a)+(y-b)*(y-b);
  distance=pow(dist,0.5);
  hops=int(distance);
  cout<<hops;
  //Type your code here.
}