import sys; input = sys.stdin.readline
N = int(input())
D = [0 for _ in range(N)]
for i in range(N):
    D[i] = int(input())
D.sort()
for i in range(N):
    print(D[i])