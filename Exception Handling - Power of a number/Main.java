class negative(Exception):
  def __init__(self):
    print("n or p should not be negative.")
    
class zero(Exception):
  def __init__(self):
    print("n and p should not be zero.")


class MyCalculator:
  def power(self,n,p):
    try:
      if(n<0 or n<0):
      	raise negative
      elif(n==0 and p==0):
        raise zero
      else:
        n=n**p
        print(n)
    except:
      pass
   	
    
n=int(input())
p=int(input())
p1=MyCalculator()
p1.power(n,p)