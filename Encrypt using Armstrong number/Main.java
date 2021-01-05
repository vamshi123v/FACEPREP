#include<iostream>
using namespace std;
int main()
{
	int number,remainder,sub,result=0,q,i,count=0;
	cin>>number;
	q=number;
	while(q != 0)
	{	
		q=q/10;
		count=count+1;	
			}
	q=number;
	while(q!=0)
	{	
	  remainder=q%10;
	  sub=1;
	  for(i=0;i<count;i++)
	{
        sub=sub*remainder;
	}
	result=result+sub;
	q=q/10;
}
	if(number==result)
	cout<<"Kindly proceed with encrypting";
	else
	cout<<"It is not an Armstrong number";
	return 0;
	
}