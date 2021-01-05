#include<iostream>
using namespace std;
int main()
{
  int score,score1,sum=0,count=0;
  cin>>score;
  while(true){
    cin>>score1;
    count++;
    sum=sum+score1;
    if(sum>=score){
      cout<<"The number of turns is "<<count;
      break;
    }
    else
      continue;
      
  }
  //Type your code here.
}