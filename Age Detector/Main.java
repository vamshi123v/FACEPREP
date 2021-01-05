#include<iostream>
using namespace std;
int main()
{
  int byear,cyear;
  cin>>byear>>cyear;
  if(byear>cyear)
  {
    byear=byear+1900;
    cyear=cyear+2000;
  }
  else{
    byear=byear+2000;
    cyear=cyear+2000;
  }
  cout<<cyear-byear;
  //Type your code here.
}