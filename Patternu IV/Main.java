#include<iostream>
using namespace std;
int main() {
  int n,i,j,temp;
  cin>>n;
  for(i=1;i<=n;i++){
    if(i%2!=0){
   for(j=1;j<=n;j++){
     if(j!=n){
     cout<<i;
     }
     else{
       temp=i+1;
       cout<<temp;
   }
   }
      cout<<"\n";
    }
    else{
       for(j=1;j<=n;j++){
         if(j==1)
       cout<<temp+1;
         else
         cout<<i;
  }
      cout<<"\n";
    }
  }
  
    // Type your code here
    return 0;
}