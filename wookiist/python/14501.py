import sys; input = sys.stdin.readline
N = int(input())
T = [0 for _ in range(N+1)]
P = [0 for _ in range(N+1)]
D = [-1 for _ in range(N+1)]
for i in range(1, N+1):
    T[i], P[i] = map(int, input().split())

def solve(day):
    if day == N+1:
        return 0
    if day > N+1:
        return -100_000_000
    if D[day] != -1:
        return D[day]
    t1 = solve(day+1)
    t2 = P[day] + solve(day+T[day])
    D[day] = max(t1, t2)
    return D[day]

for i in range(1, N+1):
    solve(i)
print(max(D))