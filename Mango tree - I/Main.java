#include<iostream>
using namespace std;
int main()
{
  int rows,columns,num,i,flag=1;
  cin>>rows>>columns>>num;
  if(num<=columns){
     cout<<"Yes";
  }
  else{
     for(i=1;i<columns;i++)
     {
       if((num==columns*i+1)||(num==columns*i)){
         cout<<"Yes";
         flag=0;
         break;
       }
      
  }
     if(flag==1)
         cout<<"No";
}
}