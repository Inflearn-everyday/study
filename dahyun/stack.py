N = int(input())
x_list = []
for _ in range(N):
    x = input()
    if x == "pop":
        if len(x_list)>0:
            print(x_list.pop())
        else:
            print(-1)
    elif x == "size":
        print(len(x_list))
    elif x == "empty":
        if len(x_list) == 0:
            print(1)
        else:
            print(0)
    elif x == "top":
        if len(x_list)>0:
            print(x_list[-1])
        else:
            print(-1)
    else:
        a = x.split()
        x_list.append(a[1])
