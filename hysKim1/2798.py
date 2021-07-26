N, M = map(int, input().split())
li = sorted(list(map(int, input().split())))
ans_li = []
for i in range(N-2):
    for j in range(i+1, N-1):
        for k in range(j+1, N):
            s = li[i] + li[j] + li[k]
            if s <= M:
                ans_li.append(s)
ans_li.sort()
print(ans_li[-1])