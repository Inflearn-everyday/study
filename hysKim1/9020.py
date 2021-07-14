#9020  골드바흐의 추측

m = 10000
s = [0,0] + [1]*(m-1)
for i in range(2, int(m**0.5)+1):
    for j in range(i+i, m+1, i):
        if s[i]: s[j]=0
for _ in range(int(input())):
    n = int(input())
    r = [(x, n-x) for x, y in enumerate(s[:n//2+1]) if y and s[n-x]][-1]
    print(r[0], r[1])