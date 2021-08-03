import sys

N = int(input())
li = [int(sys.stdin.readline()) for _ in range(N)]
for n in sorted(li):
    print(n)