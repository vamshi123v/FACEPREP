#include<iostream>
using namespace std;
int main()
{
int num1,num2,x;
cout<<"Enter first number : Enter second number : Menu"<<"\n";
cout<<"1.Addition"<<"\n"<<"2.Subtraction"<<"\n"<<"3.Multiplication"<<"\n";
cout<<"4.Division"<<"\n"<<"5.Remainder"<<"\n";
cin>>num1>>num2>>x;
switch(x)
{
  case 1:
    cout<<num1+num2;
    break;
  case 2:
    cout<<num1-num2;
    break;
  case 3:
    cout<<num1*num2;
    break;
  case 4:
    cout<<num1/num2;
    break;
  case 5:
    cout<<
      num1%num2;
    break;
  default:
    cout<<"Invalid operation";
    
}
}