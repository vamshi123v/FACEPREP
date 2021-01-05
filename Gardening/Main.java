#include<iostream>
using namespace std;
int main()
{
  int rows,columns,num,total,mango1;
  cin>>rows>>columns>>num;
  total=rows*columns;
  if((num>rows&&num<=rows*2)||(num>total-rows*2&&num<=total-rows))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree"; 
  //Type your code here.
}