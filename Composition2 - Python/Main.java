class Passport:
  def print(self,n,a,p):
    print("Name :",n)
    print("Address :",a)
    print("Passport Number :",p)
    
    
class Person:
  def display(self,name,add,passp):
    o2=Passport()
    o2.print(name,add,passp)
  
  
n=str(input())
a=str(input())
pn=str(input())

o=Person()
o.display(n,a,pn)