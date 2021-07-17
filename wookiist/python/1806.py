import sys; input = sys.stdin.readline
N, S = map(int, input().split())
A = [int(x) for x in input().split()]
start = end = partialSum = 0
res = 100_000_000
while True:
    if partialSum >= S:
        partialSum -= A[start]
        start += 1
    elif end == N:
        break
    else:
        partialSum += A[end]
        end += 1
    if partialSum >= S:
        res = min(res, end-start)
if res == 100_000_000:
    print(0)
else:
    print(res)