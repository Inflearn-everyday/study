cnt = int(input())
arr = []
for i in range(0, cnt):
    line = input().split()
    x = int(line[0])
    y = int(line[1])
    arr.append([x, y])
ranks = []
for i in range(0, cnt):
    rank = 1
    for j in range(0, cnt):
        if i == j :
            continue
        if arr[j][0] > arr[i][0] and arr[j][1] > arr[i][1]:
            rank += 1
    print(rank, end=' ')
