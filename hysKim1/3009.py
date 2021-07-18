v = []
for _ in range(3):
    v.append(list(input().split()))
ans = [0,0]  
for i in range(3):  
    ans[0] ^= int(v[i][0])  
    ans[1] ^= int(v[i][1])
for n in ans:
    print(n, end = ' ')

x = []
y = []

for i in range(3):
    a,b = map(int,input().split())

    if a in x : x.remove(a)
    else : x.append(a)
    if b in y : y.remove(b)
    else : y.append(b)

print(*x,*y)


x=y=0
exec("a,b=map(int,input().split());x^=a;y^=b;"*3)
print(x,y)