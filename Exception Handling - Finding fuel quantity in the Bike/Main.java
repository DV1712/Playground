class null(Exception):
  def __init__(self):
  	print(end="")
  
  
n=input()

try:
  if(n.isalpha()==True):
    raise null
  if(n==0):
    raise null
  else:
    print("Petrol Quantity = ",n)
except null:
  print("There is no fuel in the Bike")