class salary:
  def __init__(self,tot):
    self.total=tot
    self.get_total(self.total)
  def get_total(self,tot):
    print("Total:",tot)
  
class employee:
  def __init__(self,sal,bon):
    
    self.sal=sal
    self.bon=bon
    self.annual_salary(sal,bon)
    
  def annual_salary(self,sal,bon):
    tot=(self.sal)*12
    tot+=self.bon
    self.o2=salary(tot)
    
    
    
    
s=int(input())
b=int(input())
o=employee(s,b)
