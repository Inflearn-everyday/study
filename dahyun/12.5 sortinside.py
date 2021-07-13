N = input()
x_list = []

for i in N:
    x_list.append(int(i))

x_list.sort(reverse = True)
for i in range(len(N)):
    print(x_list[i], end='')
