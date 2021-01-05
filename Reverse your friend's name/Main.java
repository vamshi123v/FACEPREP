#include<iostream>
#include<string>
using namespace std;
int main()
{ 
string name;
getline(cin,name);
  for(string::reverse_iterator i=name.rbegin();i<name.rend();i++)
    cout<<*i;
//Type your code here
}