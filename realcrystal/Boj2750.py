n = int(input())
arr = []
for i in range(0, n):
    arr.append(int(input()))
for i in range(0, n):
    min_idx = i
    for j in range(i+1, n):
        if arr[min_idx] > arr[j]:
            min_idx = j
    arr[i], arr[min_idx] = arr[min_idx], arr[i]

for i in range(0, n):
    print(arr[i])
