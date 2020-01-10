import math
n=int(input())
m=int(input())

try:
  if(m==0):
    raise ZeroDivisionError
  else:
    z=math.floor(n/m)
    print("{:d} // {:d}  = ".format(n,m),z)
except ZeroDivisionError:
  print("You cannot divide a number by zero")