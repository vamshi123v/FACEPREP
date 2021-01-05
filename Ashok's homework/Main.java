#include<iostream>
int main()
{
    int r, c;
    std::cin>>r>>c;
    int a[r][c],b[r][c];
  for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cin>>a[i][j];
        }
  }
   for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cin>>b[i][j];
        }
  }

    // Type your code here

     for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            a[i][j]=a[i][j]+b[i][j];
            std::cout<<a[i][j]<<" ";
        }
       std::cout<<"\n";
  }
    }