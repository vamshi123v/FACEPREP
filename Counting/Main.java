#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char vowel[11]="aeiouAEIOU";
  char consonant[43]="BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
  char digit[11]="0123456789";
  int i,j,vow=0,cons=0,whsp=0,dig=0,sym=0;
  char str[200];
  cin.getline(str,sizeof(str));
  for(i=0;i<strlen(str);i++)
  {
    for(j=0;j<strlen(vowel);j++){
    if(str[i]==vowel[j]){
      vow++;
      break;
    }
    }
    for(j=0;j<strlen(consonant);j++){
      if(str[i]==consonant[j]){
        cons++;
        break;
      }
    }
    for(j=0;j<strlen(digit);j++){
      if(str[i]==digit[j]){
        dig++;
        break;
      }
    }
    if(str[i]==' ')
      whsp++;
    else   
      sym++;
  }
  sym=sym-vow-cons-dig;
  cout<<"Vowels:"<<vow<<"\n";
  cout<<"Consonants:"<<cons<<"\n";
  cout<<"White Spaces:"<<whsp<<"\n";
  cout<<"Digits:"<<dig<<"\n";
  cout<<"Symbols:"<<sym;
  //Type your code here.
}