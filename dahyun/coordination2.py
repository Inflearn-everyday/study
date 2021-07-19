import sys

N      = int(input())
x_list = []
for _ in range(N):
    x_list.append(list(map(int, sys.stdin.readline().split())))
x_list.sort(key = lambda x : (x[1], x[0]))

for i in x_list:
    print(i[0],i[1])
