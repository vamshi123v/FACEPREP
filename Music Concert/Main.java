#include<iostream>
#include<cstdlib>
using namespace std;
void fun(int a,int *p){
  int i,tnumber,male,female;
  for(i=0;i<a;i++){
    cin>>tnumber;
     if(tnumber%2==0)
       female++;
     else
       male++;
  }
  cout<<male<<"\n";
  cout<<female;
}
int main(){
  int n;
  cin>>n;
  int *ptr=(int*)malloc(n*sizeof(int));
  fun(n,ptr);
  free(ptr);
  ptr=NULL;
  
  // Type your code here
  return 0;
}