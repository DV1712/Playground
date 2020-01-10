n=int(input())
l=[]
for i in range(0,n):
  l.append(int(input()))  
b=int(input())
c=int(input())
sum=0
try:
  if(c>n):
    raise IndexError
  else:
    for i in range(b,c):
      sum+=l[i]
    print("Sum of numbers in the given range =",sum)
except IndexError:
  print("list index out of range")