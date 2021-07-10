n1 = int(input())
n2 = int(input())
li = [1]*(n2+1)
for i in range(2, n2//2 + 1):
    if li[i] == 1:
        for j in range(i+i, n2+1, i):
            li[j] = 0
prime = []
for i in range(2, len(li)):
    if li[i] == 1:
        prime.append(i)
ans = []
for i in range(n1, n2+1):
    if i in prime:
        ans.append(i)
if len(ans) == 0:
    print(-1)
else:
    print(sum(ans))
    print(ans[0])