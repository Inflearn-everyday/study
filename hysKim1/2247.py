n=int(input())
s='*'
while n>1:
 t=[i*3 for i in s]
 s=t+[i+' '*len(i)+i for i in s]+t
 n//=3
print('\n'.join(s))