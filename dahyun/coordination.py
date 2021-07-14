N = int(input())
x_list = []
y_list = []

for _ in range(N):
    x, y = map(int, input().split())
    x_list.append(x)
    y_list.append(y)

x_list.sort()
y_list.sort()

for i in range(N):
    print(f'{x_list[i]} {y_list[i]}')
