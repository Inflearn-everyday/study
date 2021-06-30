#1193  분수찾기
n=int(input())
i=1
while(n>0):
    n-=i
    i+=1
i-=1
n1=n+i
n2=i-n1+1
print('{0}/{1}'.format(n2,n1)) if i%2 ==1 else  print('{0}/{1}'.format(n1,n2))

n=int(input())
a=0
while n>0:
    a+=1;n-=a
print("%d/%d"%(1-n,a+n)[::a%2*2-1])