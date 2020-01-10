import math
class Compute():
    
  def area(self,r,l,b):
    c=math.ceil((r*r*22)/7)
    print("Area of Circle =",c)
    a=math.ceil(l*b)
    print("Area of Rectangle =",a)
    
    
  def __init__(self,r,l,b):
    self.r=r
    self.l=l
    self.b=b
    self.area(r,l,b)
    
    
r=int(input())
l=int(input())
b=int(input())

o=Compute(r,l,b)
