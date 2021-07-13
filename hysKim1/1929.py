#1929 소수 구하기
n1, n2= map(int, input().split())
li = [1]*(n2+1)
for i in range(2, int((n2+1)**0.5) + 1):
    if li[i] == 1:
        for j in range(i+i, n2+1, i):
            li[j] = 0
for i in range(n1, n2+1):
    if li[i] == 1 and i > 1:
        print(i)