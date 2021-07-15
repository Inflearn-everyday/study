from itertools import combinations
import sys

N,M = map(int,sys.stdin.readline().split())
P = combination(range(1,N+1),M)
for i in P:
    print(' '.join(map(str,out)))
