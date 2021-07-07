import sys; input = sys.stdin.readline
G = [[int(x) for x in list(input().rstrip())] for _ in range(4)]
K = int(input())
for i in range(K):
    T, Dir = map(int, input().split())
    T -= 1
    status = [0 for _ in range(4)] # 0 무회전, 1 시계, -1 반시계
    # 왼쪽으로 이동
    status[T] = Dir
    for k in range(T-1, -1, -1):
        if G[k][2] != G[k+1][6]:
            # 다르면 이동인데, k+1번째와 반대 방향
            status[k] = (-1)*status[k+1]
        else: # 움직이지 않게 되면 이후부턴 볼 필요가 없음.
            break

    # 오른쪽으로 이동
    for k in range(T+1, 4):
        if G[k-1][2] != G[k][6]:
            status[k] = (-1)*status[k-1]
        else:
            break

    # 톱니 회전 
    for k in range(4):
        if status[k] == -1: # 반시계, 0번째가 7로 감. 1번째가 0으로 감. 
            temp = G[k][0]
            for l in range(7):
                G[k][l] = G[k][l+1]
            G[k][7] = temp
        elif status[k] == 1:
            temp = G[k][7]
            for l in range(7, 0, -1):
                G[k][l] = G[k][l-1]
            G[k][0] = temp
        else:
            continue

# 정답 구하기
answer = 0
if G[0][0] == 1:
    answer += 1
if G[1][0] == 1:
    answer += 2
if G[2][0] == 1:
    answer += 4
if G[3][0] == 1:
    answer += 8

print(answer)