class GridPoint:
  def __init__(self,x,y):
    self.x=x
    self.y=y
  
  def __add__(self,other):
    self.x+=other.x
    self.y+=other.y
  def __str__(self):
    s=''
    s+=(str(self.x))
    s+=','
    s+=(str(self.y))
    print(s)
    





a=int(input())
b=int(input())
c=int(input())
d=int(input())

o1=GridPoint(a,b)
o2=GridPoint(c,d)
o1.__add__(o2)
o1.__str__()