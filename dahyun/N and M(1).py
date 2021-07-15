from itertools import permutations
import sys

N,M = map(int,sys.stdin.readline().split())
P = permutations(range(1,N+1),M)
for i in P:
    print(' '.join(map(str,out)))
