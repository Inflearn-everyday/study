import sys; input = sys.stdin.readline
A = " "+input().rstrip(); B = " "+input().rstrip()
N, M = len(A), len(B)
D = [[0] * M for _ in range(N)]
for i in range(1, N):
    for j in range(1, M):
        if A[i] == B[j]:
            D[i][j] = D[i-1][j-1] + 1
        else:
            D[i][j] = max(D[i-1][j], D[i][j-1])
print(D[N-1][M-1])