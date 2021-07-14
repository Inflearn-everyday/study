import sys; input = sys.stdin.readline
# D[i][1] , D[i][2], D[i][3] // i를 만들 때 끝자리가 1, 2, 3인 방법의 수
T = int(input())
D = [0 for _ in range(12)]
D[1], D[2], D[3] = 1, 2, 4
for _ in range(T):
    N = int(input())
    for i in range(4, N+1):
        D[i] = D[i-1] + D[i-2] + D[i-3]
    print(D[N])
    