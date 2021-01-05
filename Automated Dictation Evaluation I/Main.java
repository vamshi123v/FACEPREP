#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char str1[50],str2[50];
  cin.getline(str1,sizeof(str1));
  cin.getline(str2,sizeof(str2));
  if(strcmp(str1,str2)==0)
    cout<<"It is correct";
  else
     cout<<"It is wrong";
  //Type your code here.
}