from itertools import combinations_with_replacement
import sys
N,M = map(int, sys.stdin.readline().split())
for i in combinations_with_replacement(range(1,N+1),M):
    for j in range(len(i)):
        print(i[j], end=' ')
    print(end='\n')
