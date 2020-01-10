a=str(input())
b=str(input())
n=int(input())

k=''
x=slice(0,n)
y=slice(n,len(a))
k+=a[x]
k+=b
k+=a[y]

  
print(k)