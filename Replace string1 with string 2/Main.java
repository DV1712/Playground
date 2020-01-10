a=str(input())
b=str(input())

for i in range(0,len(a)):
  if(a[i]==b[0]):
    k=i
    break
    

a=a.replace(a[k:],b)
print(a)