class Calculator:

  def add(num1,num2):
    a=num1+num2
    print("Addition :",a)
     
  def sub(num1,num2):
    s=num1-num2
    print("Subtraction :",s)
    
   

class AdvancedCalculator(Calculator):
  
  def div(self,num1,num2):
    d=num1/num2
    print("Floor Division :",int(d))
    
  def mul(self,num1,num2):
    m=num1*num2
    print("Multiplication :",m)
    
  def __init__(self,num1,num2):
    num1=num1
    num2=num2
    Calculator.add(num1,num2)
    Calculator.sub(num1,num2)
    self.mul(num1,num2)
    self.div(num1,num2)
    
    
    
    
#--------------------driver----------------------------#
    
    
n1=int(input())
n2=int(input())

p1=AdvancedCalculator(n1,n2)
