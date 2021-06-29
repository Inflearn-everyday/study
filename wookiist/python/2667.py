import sys; input = sys.stdin.readline
from collections import deque
N = int(input())
A = [[0]*(N+1)] + [[0]+[int(x) for x in input().rstrip()] for _ in range(N)]
C = [[False for _ in range(N+1)] for _ in range(N+1)]
dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]
answer = []

def bfs(x, y):
    q = deque()
    q.append((x,y))
    C[x][y] = True
    res = 1
    while q:
        nx, ny = q[0][0], q[0][1]
        q.popleft()
        for k in range(4):
            nnx, nny = nx+dx[k], ny+dy[k]
            if 1 <= nnx <= N and 1 <= nny <= N:
                if not C[nnx][nny] and A[nnx][nny] == 1:
                    q.append((nnx, nny))
                    C[nnx][nny] = True
                    res += 1
    return res

for i in range(1, N+1):
    for j in range(1, N+1):
        if A[i][j] == 1 and not C[i][j]:
            answer.append(bfs(i, j))

print(len(answer))
answer.sort()
for i in answer:
    print(i)
