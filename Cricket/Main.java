#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int tballs,truns,pruns,ballsb,overs;
  float oversf,crate,trate;
  cin>>tballs>>truns>>pruns>>ballsb;
  overs=tballs/6;
  oversf=ballsb/6+(float(ballsb%6))/10;
  crate=pruns/oversf;
  trate=float(truns)/overs;
  cout<<overs<<"\n";
  cout<<oversf<<"\n";
  cout<<fixed<<setprecision(1)<<crate<<"\n";
  cout<<trate<<"\n";
  if(crate>=trate)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  
  
  
  //Type your code here.
}