a=int(input())
if(a>1):
  if(a<1000000000):
    for i in range(2,a+1):
      flag=0
      for j in range(2,i):
        if(i%j==0):
          flag=1
          break        
      if(flag==0):
        print(i,end=" ")
        