x=str(input())

charlist=[]
clist=[]
dic={}
for i in range(len(x)):
  if(x[i] not in charlist):
    dic.update({x[i]:x.count(x[i])})
    

for key in sorted(dic.keys()) :
  print(key , dic[key])