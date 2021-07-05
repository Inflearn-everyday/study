list_x = []
list_y = []
for i in range(3):
    x, y = map(int, input().split())
    list_x.append(x)
    list_y.append(y)
list_x.sort()
list_y.sort()
a = list_x[1]
x = list(set(list_x) - set([a]))
b = list_y[1]
y = list(set(list_y) - set([b]))
print(f'{x[0]} {y[0]}')
