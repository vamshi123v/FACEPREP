#include<iostream>
using namespace std;
int main()
{
  int capacity,adno,chno,adult=75,child=30,total;
  cin>>capacity>>adno>>chno;
  total=adno*adult+chno*child;
  if(total<=capacity){
    cout<<"Boat is stable";
  }
  else{
    cout<<"Boat will drow";
}
}
  
 
  
  //Type your code here.