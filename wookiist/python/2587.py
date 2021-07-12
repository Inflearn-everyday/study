import sys; input = sys.stdin.readline
arr = []
for i in range(5):
    arr.append(int(input()))
print(int(sum(arr)/5))
arr.sort()
print(arr[2])