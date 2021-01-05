#include<iostream>
using namespace std;
int main()
{
	int number,i,flag=0;
	cin>>number;
	if(number>1)
	{
		for(i=2;i<number;i++)
		{
		
		if(number%i!=0)
		{	
			continue;
		}
		else
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	cout<<"Not eligible";
	else
    cout<<"Eligible";
}
  else
    cout<<"Not eligible";
}