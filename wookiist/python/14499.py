import sys; input = sys.stdin.readline
N, M, x, y, K = map(int, input().split())
G = []
for i in range(N):
    G.append([int(x) for x in input().split()])
C = [int(x) for x in input().split()]
dx = [0, 0, -1, 1] # 동 서 북 남 // 1 2 3 4
dy = [1, -1, 0, 0]
dice = [0] * 7
for c in C:
    k = c - 1
    nx, ny = x+dx[k], y+dy[k]
    if 0 > nx or nx >= N or 0 > ny or ny >= M:
        continue
    if k == 0: # 동
        temp = dice[1]
        dice[1] = dice[4]
        dice[4] = dice[6]
        dice[6] = dice[3]
        dice[3] = temp
    elif k == 1: # 서
        temp = dice[1]
        dice[1] = dice[3]
        dice[3] = dice[6]
        dice[6] = dice[4]
        dice[4] = temp
    elif k == 2: # 북
        temp = dice[1]
        dice[1] = dice[5]
        dice[5] = dice[6]
        dice[6] = dice[2]
        dice[2] = temp
    else: # 남
        temp = dice[1]
        dice[1] = dice[2]
        dice[2] = dice[6]
        dice[6] = dice[5]
        dice[5] = temp
    x, y = nx, ny
    if G[x][y] == 0:
        G[x][y] = dice[6]
    else:
        dice[6] = G[x][y]
        G[x][y] = 0
    print(dice[1])
