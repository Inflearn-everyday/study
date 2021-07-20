import sys; input = sys.stdin.readline
from collections import deque

N, M, V = map(int, input().split())
G = dict()
check = [False for _ in range(N+1)]
for _ in range(M):
    a, b = map(int, input().split())
    if a in G:
        G[a].append(b)
    else:
        G[a] = [b]
    if b in G:
        G[b].append(a)
    else:
        G[b] = [a]

for n in G:
    G[n].sort()
    
def dfs(x):
    print(x, end=' ')
    check[x] = True
    if x in G:
        for nx in G[x]:
            if not check[nx]:
                dfs(nx)

def bfs(x):
    q = deque([x])
    check[x] = True
    while q:
        nx = q.popleft()
        print(nx, end=' ')
        if nx in G:                
            for nnx in G[nx]:
                if not check[nnx]:
                    q.append(nnx)
                    check[nnx] = True

dfs(V)
print()
check = [False for _ in range(N+1)]
bfs(V)
