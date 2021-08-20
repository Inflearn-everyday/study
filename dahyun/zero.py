k = int(input())
k_list = []
for _ in range(k):
    x = int(input())
    if x == 0:
        k_list.pop()
    else:
        k_list.append(x)

print(sum(k_list))
