def chess(li):
    c1 = ['WBWBWBWB', 'BWBWBWBW', 'WBWBWBWB', 'BWBWBWBW', 'WBWBWBWB', 
              'BWBWBWBW', 'WBWBWBWB', 'BWBWBWBW']
    c2 = ['BWBWBWBW', 'WBWBWBWB', 'BWBWBWBW', 'WBWBWBWB', 
              'BWBWBWBW', 'WBWBWBWB', 'BWBWBWBW', 'WBWBWBWB']
    n1 = 0
    n2 = 0
    for i in range(8):
        for j in range(8):
            if c1[i][j] != li[i][j]:
                n1 += 1
            if c2[i][j] != li[i][j]:
                n2 += 1
    return min(n1, n2)

N, M = map(int, input().split())
li = []
for i in range(N):
    li.append(input())

ans = N*M
for n in range(N-7):
    for m in range(M-7):
        t_li = []
        for i in range(8):
            t = []
            for j in range(8):
                t.append(li[i+n][j+m])
            t_li.append(t)
        ans = min(ans, chess(t_li))
print(ans)
