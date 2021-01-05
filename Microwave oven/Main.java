#include<iostream>
using namespace std;
int main()
{
 int items;
  float stime,ttime;  
  cin>>items;
  cin>>stime;
  if(items==2){
    ttime=stime+stime/2;
    cout<<ttime;
  }
  else if(items==3){
    ttime=2*stime;
    cout<<ttime;
  }
  else
    cout<<"Number of items is more";
  //Type your code here.
}