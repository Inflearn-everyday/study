#2839 설탕 배달
n= int(input())
i=ok=0
while(i<n/3+1):
    if (n-3*i) %5==0:
        ok=1
        break
    i+=1
print((n-3*i)//5+i) if ok else print(-1)