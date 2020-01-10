x=str(input())

charlist=[]
clist=[]
for i in range(len(x)):
  if(x[i] not in charlist):
    charlist.append(x[i])
    clist.append(x.count(x[i]))
    
for i in range(len(clist)):
  print(charlist[i],end="")
  print(clist[i],end="")