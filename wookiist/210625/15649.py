import sys; input = sys.stdin.readline
N, M = map(int, input().split())
C = [False for _ in range(N+1)]
A = [0 for _ in range(M)]
def solve(idx, n, m):
    if idx == m:
        print(*A)
        return
    for i in range(1, n+1):
        if C[i]: continue
        C[i] = True
        A[idx] = i
        solve(idx+1, n, m)
        C[i] = False
solve(0, N, M)
