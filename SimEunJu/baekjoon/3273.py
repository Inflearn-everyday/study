import sys
input = sys.stdin.readline

len = int(input())
nums = list(map(int, input().split()))
nums.sort()
target = int(input())

start = 0
end = len - 1
res = 0
while start < end:
    temp = nums[start] + nums[end]
    if temp == target:
        res += 1
        start += 1
        end -= 1
    elif temp < target:
        start += 1
    else:
        end -= 1
    
print(res)
