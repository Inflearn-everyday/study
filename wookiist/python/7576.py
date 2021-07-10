from collections import deque
import sys; input = sys.stdin.readline
dx = [1, -1, 0, 0]; dy = [0, 0, 1, -1]
M, N = map(int, input().split())
G = [[int(x) for x in input().split()] for _ in range(N)]
D = [[-1 for _ in range(M)] for _ in range(N)]
q = deque()
for i in range(N):
    for j in range(M):
        if G[i][j] == 1:
            q.append((i,j))
            D[i][j] = 0

while q:
    nx, ny = q.popleft()
    for k in range(4):
        nnx, nny = nx+dx[k], ny+dy[k]
        if 0 <= nnx < N and 0 <= nny < M:
            if D[nnx][nny] == -1 and G[nnx][nny] != -1:
                q.append((nnx, nny))
                D[nnx][nny] = D[nx][ny] + 1

impossible = False
for i in range(N):
    for j in range(M):
        if G[i][j] != -1 and D[i][j] == -1:
            impossible = True
            break
    if impossible:
        break

if impossible:
    print(-1)
else:
    answer = 0
    for i in range(N):
        answer = max(answer, max(D[i]))
    print(answer)