# 이것이 코딩테스트다 에제 4-1
import sys; input = sys.stdin.readline
N = int(input())
D = input().split()

dx = [1, -1, 0, 0] # D, U, R, L
dy = [0, 0, 1, -1]

axis = [1, 1]

for d in D:
    idx = 0
    if d == 'D':
        idx = 0
    elif d == 'U':
        idx = 1
    elif d == 'R':
        idx = 2
    elif d == 'L':
        idx = 3
    if 1 <= axis[0]+dx[idx] <= N and 1 <= axis[1]+dy[idx] <= N:
        axis[0], axis[1] = axis[0] + dx[idx], axis[1] + dy[idx]
print(axis[0], axis[1])