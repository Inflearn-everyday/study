import sys
N = int(input())
x_list = []

for i in range(N):
    x_list.append(list(sys.stdin.readline().split()))

x_list.sort(key = lambda x: int(x[0]))

for i in range(N):
    print(x_list[i][0],x_list[i][1])
