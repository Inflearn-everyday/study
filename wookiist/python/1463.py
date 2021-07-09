N = int(input())
# D[x] = x를 1로 만드는 방법의 최솟값
D = [100_000_000 for _ in range(N+1)]
D[1] = 0
for i in range(N+1):
    if i % 3 == 0:
        D[i] = D[i//3] + 1
    if i % 2 == 0:
        D[i] = min(D[i], D[i//2] + 1)
    D[i] = min(D[i], D[i-1]+1)
print(D[N])