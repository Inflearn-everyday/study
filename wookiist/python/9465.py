import sys; input = sys.stdin.readline
T = int(input())
for _ in range(T):
    N = int(input())
    S1 = [0] + [int(x) for x in input().split()]
    S2 = [0] + [int(x) for x in input().split()]
    D = [[0]*3 for _ in range(N+1)]
    for i in range(1, N+1):
        D[i][0] = max(D[i-1])
        D[i][1] = max(D[i-1][0], D[i-1][2]) + S1[i]
        D[i][2] = max(D[i-1][0], D[i-1][1]) + S2[i]
    print(max(D[N]))