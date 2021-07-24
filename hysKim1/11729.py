def f(a,b,c,n):
 if n:f(a,c,b,n-1)
 print(a,c)
 if n:f(b,a,c,n-1)
n=int(input())
print(2**n-1)
f(1,2,3,n-1)