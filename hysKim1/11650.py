li = []
for _ in range(int(input())):
    li.append(list(map(int, input().split())))
li.sort(key=lambda x : x[1])
li.sort(key=lambda x : x[0])
for i in li:
    print(*i)