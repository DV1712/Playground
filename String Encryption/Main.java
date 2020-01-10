a=str(input())
k=int(input())

l=list(a)

for i in range(len(l)):
  if(l[i]!=' '):
    p=ord(l[i])
    z=ord(l[i])+k
    if(p>64 and p<91):
      while(not((z>64 and z<91))):
        z-=26
    elif(p>96 and p<123):
      while(not(z>96 and z<123)):
        z-=26
    else:
      pass        
    l[i]=chr(z)
  else:
    l[i]=l[i]

b=''  
for i in range(len(l)):
  b+=l[i]
print(b)