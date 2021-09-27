import sys
from collections import deque
input = sys.stdin.readline

height, width = map(int, input().split())
nums = []
for row in range(height):
    nums.append(list(map(int, list(input().strip()))))

# 일단, 0을 따라 경로 찾기 - ok
# 최단 경로

def bfs():
    q = deque([(0, 0)])
    visit = [[[0,0] for _ in range(width)] for _ in range(height)]
    visit[0][0][0] = 1
    dx = [0, 1, 0, -1]
    dy = [1, 0, -1, 0]
    res =  0
    while q:
        x, y = q.popleft()
        if x == height - 1 and y == width - 1:
            return visit[x][y][1] + 1
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < height and 0 <= ny < width:
                if visit[nx][ny][0] == 0 and nums[nx][ny] == 1:
                    q.append((nx, ny))
                    visit[nx][ny][1] = visit[x][y][1] + 1
                visit[nx][ny][0] = 1
    
    return -1            
                
print(bfs())
        
        
        
        
        
