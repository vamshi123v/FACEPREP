#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char str[50],rev[50],test[50];
  int i,j;
  cin.getline(str,sizeof(str));
  cin.getline(rev,sizeof(rev));
  for(i=0,j=strlen(str)-1;i<strlen(str);i++,j--)
    test[i]=str[j];
  test[strlen(str)]='\0';
  //cout<<test;
  if(strcmp(test,rev)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  //Type your code here.
}