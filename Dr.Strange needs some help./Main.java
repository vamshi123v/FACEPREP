#include<iostream>
using namespace std;
int bacteria(int x,int y){
  int result=x;
  for(int i=1;i<y;i++){
    result=result*x;
  }
  return result;
}
int main()
{
  int m,n,req,final;
  cin>>m>>n>>req;
  final=bacteria(m,n);
  if(final>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}