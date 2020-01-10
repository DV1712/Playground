class InvalidbloodDonate(Exception):
  def __init__(self):
    print(end="")

age=int(input())
weight=int(input())

try:
  if(age<18 or weight<55):
    raise InvalidbloodDonate
  else:
    print("Can donate blood")
    
except InvalidbloodDonate:
  print("Not eligible to donate blood")