import numpy as np
N, M = map(int, input().split())

A = []
B = []

for i in range(N):
    A.append(list(map(int, input().split())))

M, K = map(int, input().split())

for i in range(M):
    B.append(list(map(int, input().split())))

C = np.dot(A,B)
for i in range(N):
    print(end='\n')
    for j in range(K):
        print(C[i][j], end=' ')
