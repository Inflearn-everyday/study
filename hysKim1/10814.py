li = []
for _ in range(int(input())):
    age, name = input().split()
    li.append([int(age), name])
li.sort(key=lambda x : x[0])
for i in li:
    print(*i)