import sys
n = int(input())
arr = []
i = 0
while(i < n):
    arr.append(int(sys.stdin.readline()))
    i += 1
arr.sort()
print(*arr, sep='\n')
