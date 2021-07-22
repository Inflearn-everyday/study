N = int(input())
x = list(map(int, input().split()))

x_list = list(sorted(set(x)))
x_list = {x_list[i]: i for i in range(len(x_list))}
print(*[x_list[i] for i in x])
