#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char i;
  int k=0;
  char alpha[52];
  for(i=65;i<=90;i++){
    alpha[k]=i;
    k++;
  }
  int j=strlen(alpha);
  for(i=97;i<=122;i++){
    alpha[j]=i;
    j++;
  }
  alpha[strlen(alpha)-1]='\0';
  char str[200],output[100];
  cin.getline(str,sizeof(str));
 for(i=0;i<strlen(str);i++){
    for(j=0;j<strlen(alpha);j++){
      static int k=0;
      if(str[i]==alpha[j]){
        output[k]=str[i];
        k++;
        break;
    }
    }
 }
  cout<<output;  
  //Type your code here.
}