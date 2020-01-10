class person:
  def  display(name):
    print("Name of Person =",name)

    
class staff(person):
  def  display(name,eyed):
    person.display(name)
    print("Staff Id is  =",eyed)
    
    
class temporaryStaff(staff):
  
  def  salary(self,days,hours):
    self.sal=self.hours*150*self.days
    
  def  display(self,):
    print("No. of Days =",self.days)
    print("No. of Hours Worked =",self.hours)
    print("Total Salary =",self.sal)
    
  def __init__(self,name,eyed,days,hours):
    self.days=days
    self.hours=hours
    
    staff.display(name,eyed)
    self.salary(days,hours)
    self.display()
    
    
    
#----------------driver program----------------

n=str(input())
i=int(input())
d=int(input())
h=int(input())

p=temporaryStaff(n,i,d,h)