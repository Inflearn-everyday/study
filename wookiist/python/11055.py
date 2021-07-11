import sys; input = sys.stdin.readline
N = int(input())
A = [0] + [int(x) for x in input().split()]
# D[i] = i번째 수를 마지막으로 하는 가장 큰 증가 부분수열의 합을 찾는다.
D = [0 for _ in range(N+1)]
for i in range(1, N+1):
    temp = A[i]
    for j in range(1 ,i):
        if A[i] > A[j]:
            temp = max(temp, D[j]+A[i])
    D[i] = temp
print(max(D))
