arr = input().split()
a = int(arr[0]) #고정 비용
b = int(arr[1]) #가변 비용
c = int(arr[2]) #가격
x = 0;
if c - b <= 0:
    print(-1)
else:
    print(int(a / (c - b)) + 1)
