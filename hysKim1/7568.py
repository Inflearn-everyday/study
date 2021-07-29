
N = int(input())
li = []
ans = []
for i in range(N):
    li.append(list(map(int, input().split())))
for i in range(N):
    cnt = 1
    for wh in li:
        if li[i][0] < wh[0] and li[i][1] < wh[1]:
            cnt += 1
    ans.append(str(cnt))
print(' '.join(ans))