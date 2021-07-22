import sys; input = sys.stdin.readline
N = int(input())
A = [0] + [int(x) for x in input().split()]
D = [1 for _ in range(N+1)]
for i in range(1, N+1):
    for j in range(i, 0, -1):
        if A[i] > A[j]:
            D[i] = max(D[i], D[j]+1)
print(max(D))