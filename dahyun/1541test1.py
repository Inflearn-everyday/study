list_minus = input().split('-') 
x = 0 

for i in list_minus[0].split('+'): 
  x += int(i) 
for i in list_minus[1:]: 
  for j in i.split('+'): 
    x -= int(j) 
print(x)
