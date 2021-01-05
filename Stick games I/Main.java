#include<iostream>
using namespace std;
int main()
{
  int n,m,points,count=0;
  cin>>n>>m;
  points=n*m;
  while(true){
    points=points-(n+m-1);
    n--;
    m--;
    count++;
    if(points<=0)
      break;
  }
    if(count%2==0)
      cout<<"Mani Iyer";
    else
      cout<<"Arun Gupta";
}
  //Type your code here.