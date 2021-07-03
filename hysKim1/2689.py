#2869	달팽이는 올라가고 싶다
A,B,V =map(int, input().split())
n=(V-B)//(A-B)
if (V-B)%(A-B):
    print(n+1)
else:
    print(n)


a,b,c=map(int,input().split())
print(int((c-a)/(a-b)+.99)+1)

print((V-A)//(A-B)+1+(((V-A)%(A-B))!=0))
