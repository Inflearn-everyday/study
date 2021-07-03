import sys; input = sys.stdin.readline
N = int(input())
A = [int(x) for x in input().split()]
Amap = dict()
for i in A:
    if Amap.get(i) is None:
        Amap[i] = 1
    else:
        Amap[i] += 1
M = int(input())
B = [int(x) for x in input().split()]
for i in B:
    if Amap.get(i) is None:
        print(0, end=" ")
    else:
        print(Amap[i], end=" ")